package easy._27_RemoveElement;

import leetcode.LeetcodeMission;

import java.util.Arrays;
import java.util.List;

public class _27_Mission extends LeetcodeMission {

    public _27_Mission() {
        this.setTopic(new Topic27(new int[]{3, 2, 2, 3}, 3, Arrays.asList(2, 2, null, null), 2));
        this.setTopic(new Topic27(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, Arrays.asList(0, 1, 3, 0, 4, null, null, null), 3));
    }

    static class Topic27 extends Topic {
        int[] nums;
        int val;
        List<Integer> expectedNums;
        int removeElement;

        public Topic27(int[] nums, int val, List<Integer> expectedNums, int removeElement) {
            this.nums = nums;
            this.val = val;
            this.expectedNums = expectedNums;
            this.removeElement = removeElement;
        }
    }
}
