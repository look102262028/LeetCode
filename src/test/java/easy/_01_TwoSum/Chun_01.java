package easy._01_TwoSum;

import leetcode.LeetcodeInterface;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Chun_01 extends LeetcodeTest {

  private List<Topic> topicList = new ArrayList<>();

  @Test
  @DisplayName("TwoSum")
  @Override
  public void runMain() {
    // 1. 寫入範例
    this.example();
    // 2. 執行
    topicList.forEach(this::runTopic);
  }

  @Override
  public void runTopic(LeetcodeInterface.Topic topic) {
    // 轉換參數
    Topic demo = (Topic) topic;
    int[] nums = demo.nums;
    int target = demo.target;
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

    int[] result = demo.result;
    System.out.printf("result:%s, assert:%s, output:%s%n", Arrays.toString(result), Arrays.equals(result, output), Arrays.toString(output));
  }


  @Override
  public void example() {
    topicList.add(new Topic(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}));
    topicList.add(new Topic(new int[]{3, 2, 4}, 6, new int[]{1, 2}));
    topicList.add(new Topic(new int[]{3, 3}, 6, new int[]{0, 1}));
  }

  static class Topic extends LeetcodeInterface.Topic {
    int[] nums;
    int target;
    int[] result;

    public Topic(int[] nums, int target, int[] result) {
      this.nums = nums;
      this.target = target;
      this.result = result;
    }
  }
}
