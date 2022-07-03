package easy._01_TwoSum;

import leetcode.LeetcodeInterface;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Chun_01 extends LeetcodeTest {

  private List<Topic> topicList = new ArrayList<>();

  @Test
  @DisplayName("")
  @Override
  public void runMain() {
    // 1. 寫入範例
    this.example();
    // 2.
    topicList.forEach(this::runTopic);
  }

  @Override
  public void runTopic(LeetcodeInterface.Topic topic) {

  }


  @Override
  public void example() {
    topicList.add(new Topic(new int[]{2, 7, 11, 15}, 9));
  }


  static class Topic extends LeetcodeInterface.Topic{
    int[] nums;
    int target;

    public Topic(int[] nums, int target) {
      this.nums = nums;
      this.target = target;
    }
  }
}
