package easy._01_TwoSum;

import leetcode.LeetcodeMission;

public class _01_Mission extends LeetcodeMission {

  public _01_Mission() {
    this.setTopic(new Topic01(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}));
    this.setTopic(new Topic01(new int[]{3, 2, 4}, 6, new int[]{1, 1}));
    this.setTopic(new Topic01(new int[]{3, 3}, 6, new int[]{0, 1}));
  }

  static class Topic01 extends Topic {
    int[] nums;
    int target;
    int[] result;

    public Topic01(int[] nums, int target, int[] result) {
      this.nums = nums;
      this.target = target;
      this.result = result;
    }
  }
}
