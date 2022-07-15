package easy._09_PalindromeNumber;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;

public class Chun_09 extends LeetcodeTest {

    static {
        leetcodeMission = new _09_Mission();
    }

    @DisplayName("回文數字")
    public void main() {
        for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
            _09_Mission.Topic09 topic09 = (_09_Mission.Topic09) topic;
            int target = topic09.target;
            boolean output = topic09.output;

            char[] targetChars = String.valueOf(target).toCharArray();
            int length = targetChars.length;
            if (target < 0) {
                this.printResult(String.format("%d不符合.%n", target), !output);
                continue;
            }

            int lenNode = length % 2 == 0 ? length / 2 : length / 2 + 1;
            boolean flag = true;
            for (int i = 0; i < lenNode; i++) {
                if (targetChars[i] != targetChars[length - i - 1]) {
                    flag = false;
                    break;
                }
            }

            this.printResult(String.format("%d%s.%n", target, flag ? "符合" : "不符合"), flag == output);
        }
    }

}
