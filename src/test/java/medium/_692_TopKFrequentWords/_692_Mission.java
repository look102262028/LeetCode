package medium._692_TopKFrequentWords;

import leetcode.LeetcodeMission;

public class _692_Mission extends LeetcodeMission {

    public _692_Mission() {
        this.setTopic(new Topic692(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2, new String[]{"i", "love"}));
        this.setTopic(new Topic692(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4, new String[]{"the","is","sunny","day"}));
    }

    static class Topic692 extends Topic {
        String[] input;
        int k;
        String[] output;

        public Topic692(String[] input, int k, String[] output) {
            this.input = input;
            this.k = k;
            this.output = output;
        }
    }
}
