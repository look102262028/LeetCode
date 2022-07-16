package easy._27_RemoveElement;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.DisplayName;

import java.util.List;
import java.util.stream.Collectors;

public class Chun_27 extends LeetcodeTest {

    static {
        leetcodeMission = new _27_Mission();
    }


    @DisplayName("移除陣列")
    public void main() {
        for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
            _27_Mission.Topic27 topic27 = (_27_Mission.Topic27) topic;
            int[] nums = topic27.nums;
            int val = topic27.val;
            int[] expectedNums = topic27.expectedNums;
            int removeElement = topic27.removeElement;

            int length = nums.length;
            int[] results = new int[length];
            int index = 0;
            int count = 0;

            for (int num : nums) {
                if (num == val) {
                    count++;
                } else {
                    results[index] = num;
                    index++;
                }
            }

            this.print("array:" + Arrays.asList(results).stream().map(String::valueOf).collect(Collectors.joining(",")));
            this.print("count:" + count);
            this.print("remove:" + removeElement);

        }
    }
}
