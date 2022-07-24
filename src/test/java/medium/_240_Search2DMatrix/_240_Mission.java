package medium._240_Search2DMatrix;

import leetcode.LeetcodeMission;

public class _240_Mission extends LeetcodeMission {

  public _240_Mission() {
    int[] array1 = new int[]{1, 4, 7, 11, 15};
    int[] array2 = new int[]{2, 5, 8, 12, 19};
    int[] array3 = new int[]{3, 6, 9, 16, 22};
    int[] array4 = new int[]{10, 13, 14, 17, 24};
    int[] array5 = new int[]{18, 21, 23, 26, 30};
    this.setTopic(new Topic240(new int[][]{array1, array2, array3, array4, array5}, 5, true));
    this.setTopic(new Topic240(new int[][]{new int[]{-5}}, -2, false));
    this.setTopic(new Topic240(new int[][]{new int[]{2, 2}}, 1, false));
    this.setTopic(new Topic240(new int[][]{new int[]{1, 3, 5}}, 3, true));
    this.setTopic(new Topic240(new int[][]{new int[]{-1, 3}}, 1, true));
    this.setTopic(new Topic240(new int[][]{new int[]{1}, new int[]{1}}, 0, false));
    this.setTopic(new Topic240(new int[][]{
        new int[]{1, 4, 7, 11, 15},
        new int[]{2, 5, 8, 12, 19},
        new int[]{3, 6, 9, 16, 22},
        new int[]{10, 13, 14, 17, 24},
        new int[]{18, 21, 23, 26, 30}
    }, 20, false));
    this.setTopic(new Topic240(new int[][]{
        new int[]{1, 2, 3, 4, 5},
        new int[]{6, 7, 8, 9, 10},
        new int[]{11, 12, 13, 14, 15},
        new int[]{16, 17, 18, 19, 20},
        new int[]{21, 22, 23, 24, 25}
    }, 19, true));
    this.setTopic(new Topic240(new int[][]{new int[]{1, 4}, new int[]{2, 5}}, 5, true));
    this.setTopic(new Topic240(new int[][]{
        new int[]{1, 4, 7, 11, 15},
        new int[]{2, 5, 8, 12, 19},
        new int[]{3, 6, 9, 16, 22},
        new int[]{10, 13, 14, 17, 24},
        new int[]{18, 21, 23, 26, 30}
    }, 5, true));
  }

  static class Topic240 extends Topic {

    int[][] arrays;
    int target;
    boolean output;

    public Topic240(int[][] arrays, int target, boolean output) {
      this.arrays = arrays;
      this.target = target;
      this.output = output;
    }
  }
}
