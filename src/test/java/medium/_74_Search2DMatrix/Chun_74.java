package medium._74_Search2DMatrix;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;

public class Chun_74 extends LeetcodeTest {

  static {
    leetcodeMission = new _74_Mission();
  }

  @Override
  public void main() {
    for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
      _74_Mission.Topic74 topic74 = (_74_Mission.Topic74) topic;
      int[][] matrix = topic74.arrays;
      int target = topic74.target;
      boolean result = false;

      System.out.println("================== "+ target +" ==================");
      int x = matrix.length - 1;
      int y = matrix[0].length - 1;
      if (matrix[x][y] == target) {
        result = true;
      }

      if (x == 0 && y == 0) {
        result = matrix[x][y] == target;
      }

      do {
        if (x == 0) {
          break;
        }
        int temp = matrix[--x][y];
        if (temp == target) {
          result = true;
        } else if (temp < target) {
          x++;
          break;
        }
      } while (x != 0);

      do {
        if (y == 0) {
          break;
        }
        int temp = matrix[x][--y];
        if (temp == target) {
          result = true;
        } else if (temp < target) {
          y++;
          break;
        }
      } while (y != 0);

      printResult("確認", result == topic74.output);
    }
  }
}
