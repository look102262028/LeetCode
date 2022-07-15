package easy._27_RemoveElement;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

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
            List<Integer> expectedNums = topic27.expectedNums;
            int removeElement = topic27.removeElement;

            int length = nums.length;
            int count = 0;
            for (int num : nums) {
                if (num == val) count++;
            }

            if (count != 0) {
                boolean flag = removeElement == count;
                this.print(String.format("count:%d, removeCount:%d%n", count, removeElement));
                this.printResult(String.format("有%d個%d,移除數量%s%n", count, val, flag ? "正確" : "錯誤"), flag);
            }
        }
    }
}
