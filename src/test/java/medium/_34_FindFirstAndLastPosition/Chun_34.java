package medium._34_FindFirstAndLastPosition;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;

public class Chun_34 extends LeetcodeTest {

  static {
    leetcodeMission = new _34_Mission();
  }

  @Override
  public void main() {
    for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
      _34_Mission.Topic34 topic34 = (_34_Mission.Topic34) topic;
      int[] nums = topic34.nums;
      int target = topic34.target;
      int[] output = topic34.output;

      int[] result;
      boolean middle = false;
      boolean first = false;
      boolean last = false;
      int firstIndex = -1;
      int lastIndex = -1;
      int length = nums.length;
      int arrFirst = 0;
      int arrLast = length;
      int index = -1;
      int count = 0;


      while (length != 0 || (middle && first && last)) {
        count++;

        if (middle) {

          firstIndex = index;
          lastIndex = index;
          int maxlength = length;
          for (int i = 0; i < count; i++) {
            maxlength = maxlength / 2;
          }

          int firstCount = 0;
          do {
            if (nums[--firstIndex] != target) {
              first = true;
            }
            firstCount++;
          } while (!first || firstCount < maxlength);

          int lastCount = 0;
          do {
            if (nums[--lastIndex] != target) {
              last = true;
            }
            lastCount++;
          } while (!last || lastCount < maxlength);

        } else {
          index = (arrLast - arrFirst) / 2;
          if (nums[index] == target) {
            middle = true;
          } else if (nums[index] > target) {
            arrLast = (arrLast - index) / 2;
          } else {
            arrFirst = (arrFirst + index) / 2;
          }
        }
      }


      Range range = new Range();
      recursive(range, middle, first, last, nums, target, 0, nums.length);
      result = new int[]{range.head, range.last};
      printResult("確認", result == output);
    }

  }

  private void recursive(Range range, boolean middle, boolean first, boolean last, int[] nums, int target, int arrFirst, int arrLast) {
    if (middle && first && last) {
      return;
    }

    int index = (arrLast - arrFirst) / 2;
    if (middle) {

    } else if (nums[index] > target) {
      recursive(range, false, first, last, nums, target, arrFirst, (arrLast - index) / 2);
    } else if (nums[index] < target) {
      recursive(range, false, first, last, nums, target, (arrFirst + index) / 2, arrLast);
    } else {
      recursive(range, true, first, last, nums, target, (arrFirst + index) / 2, (arrLast - index) / 2);
    }
  }

  static class Range {
    int head = -1;
    int last = -1;
  }
}
