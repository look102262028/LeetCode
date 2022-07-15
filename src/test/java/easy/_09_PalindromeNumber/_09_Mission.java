package easy._09_PalindromeNumber;

import leetcode.LeetcodeMission;

public class _09_Mission extends LeetcodeMission {

    public _09_Mission() {
        this.setTopic(new Topic09(121, true));
        this.setTopic(new Topic09(123, false));
        this.setTopic(new Topic09(-121, false));
        this.setTopic(new Topic09(10, false));
        this.setTopic(new Topic09(1, true));
        this.setTopic(new Topic09(11, true));
    }

    static class Topic09 extends Topic {
        int target;
        boolean output;

        public Topic09(int target, boolean output) {
            this.target = target;
            this.output = output;
        }
    }
}
