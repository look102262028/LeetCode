package medium._74_Search2DMatrix;

import leetcode.LeetcodeMission;

public class _74_Mission extends LeetcodeMission {

  public _74_Mission(){
    setTopic(new Topic74(new int[][]{
        new int[]{1,3,5,7},
        new int[]{10,11,16,20},
        new int[]{23,30,34,60}
    }, 3,true));
    setTopic(new Topic74(new int[][]{new int[]{1}}, 0,false));
    setTopic(new Topic74(new int[][]{new int[]{1},new int[]{1}}, 0,false));
    setTopic(new Topic74(new int[][]{
        new int[]{1,3,5,7},
        new int[]{10,11,16,20},
        new int[]{23,30,34,60}
    }, 10,true));
  }

  static class Topic74 extends Topic {

    int[][] arrays;
    int target;
    boolean output;

    public Topic74(int[][] arrays, int target, boolean output) {
      this.arrays = arrays;
      this.target = target;
      this.output = output;
    }
  }
}
