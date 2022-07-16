package medium._692_TopKFrequentWords;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Chun_692 extends LeetcodeTest {

    static {
        leetcodeMission = new _692_Mission();
    }

    @DisplayName("")
    public void main() {
        int round = 1;
        for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
            _692_Mission.Topic692 topic692 = (_692_Mission.Topic692) topic;
            String[] input = topic692.input;
            int k = topic692.k;
            String[] output = topic692.output;

            Map<Integer, WordNode> countMap = new HashMap<>();
            for (String word : input) {
                int hashCode = word.hashCode();
                countMap.put(hashCode,
                        countMap.containsKey(hashCode) ? countMap.get(hashCode).plus() : new WordNode(word));

            }

            AtomicInteger atomK = new AtomicInteger(k);
            List<String> resultList = countMap.values().stream()
                    .sorted((o1, o2) -> {
                        if (o1.count > o2.count) {
                            return -1;
                        } else if (o2.count > o1.count) {
                            return 1;
                        }

                        char[] word1Arr = o1.word.toCharArray();
                        char[] word2Arr = o2.word.toCharArray();

                        int i = 0;
                        do {
                            if (word1Arr[i] > word2Arr[i]) {
                                return 1;
                            } else if (word1Arr[i] < word2Arr[i]) {
                                return -1;
                            } else {
                                i++;
                            }
                        } while (word1Arr.length > i && word2Arr.length > i);

                        if (word1Arr.length == i) {
                            return -1;
                        }

                        if (word2Arr.length == i) {
                            return 1;
                        }

                        return 0;
                    })
                    .filter(node -> atomK.getAndDecrement() > 0)
                    .map(node -> node.word)
                    .collect(Collectors.toList());

            boolean flag = false;
            if (output.length == resultList.size()) {
                for (int i = 0; i < output.length; i++) {
                    if (!output[i].equals(resultList.get(i))) {
                        break;
                    }
                }

                flag = true;
            }

            this.print(String.join(",", Arrays.asList(output)));
            this.print(String.join(",",resultList));
            this.printResult(String.format("第%d筆資料%s%n", round++, flag ? "正確" : "錯誤"), flag);
        }
    }

    static class WordNode {
        String word;
        int count = 1;

        public WordNode(String word) {
            this.word = word;
        }

        public WordNode plus() {
            count++;
            return this;
        }
    }
}
