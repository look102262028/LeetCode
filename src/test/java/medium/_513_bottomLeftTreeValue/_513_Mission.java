package medium._513_bottomLeftTreeValue;

import leetcode.LeetcodeMission;

import java.util.Arrays;
import java.util.List;

public class _513_Mission extends LeetcodeMission {

    public _513_Mission(){
        this.setTopic(new Topic513(Arrays.asList(2,1,3), 1));
        this.setTopic(new Topic513(Arrays.asList(1,2,3,4,null,5,6,null,null,7), 7));
    }

    static class Topic513 extends Topic {
        List<Integer> input;
        int output;

        public Topic513(List<Integer> input, int output){
            this.input = input;
            this.output = output;
        }
    }
}
