package easy._01_TwoSum;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Chun_01 extends LeetcodeTest {

  static {
    leetcodeMission = new _01_Mission();
  }

  @DisplayName("TwoSum: output == result")
  public void main() {
    for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
      _01_Mission.Topic01 topic01 = (_01_Mission.Topic01) topic;
      int[] nums = topic01.nums;
      int target = topic01.target;
      int[] output = new int[2];

      // 解答
      final int length = nums.length;
      assert length >= 2;
      for (int i = 0; i < length - 1; i++) {
        for (int j = i + 1; j < length; j++) {
          if (target == nums[i] + nums[j]) {
            output = new int[]{i, j};
          }
        }
      }

      int[] result = topic01.result;
      final boolean sameResult = Arrays.equals(result, output);
      this.printResult(String.format("result:%s, output:%s", Arrays.toString(result), Arrays.toString(output)), sameResult);
    }
  }
}
