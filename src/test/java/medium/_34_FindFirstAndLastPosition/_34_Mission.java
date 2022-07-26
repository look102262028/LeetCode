package medium._34_FindFirstAndLastPosition;

import leetcode.LeetcodeMission;

public class _34_Mission extends LeetcodeMission {

  public _34_Mission() {
    this.setTopic(new Topic34(new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}));
    this.setTopic(new Topic34(new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1}));
    this.setTopic(new Topic34(new int[]{}, 0, new int[]{-1, -1}));
  }

  static class Topic34 extends Topic {

    int[] nums;
    int target;
    int[] output;

    public Topic34(int[] nums, int target, int[] output) {
      this.nums = nums;
      this.target = target;
      this.output = output;
    }
  }
}
