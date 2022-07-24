package medium._240_Search2DMatrix;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;

public class Chun_240 extends LeetcodeTest {

  static {
    leetcodeMission = new _240_Mission();
  }

  @Override
  @DisplayName("檢索目標位置")
  public void main() {
    for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
      _240_Mission.Topic240 topic240 = (_240_Mission.Topic240) topic;
      int[][] matrix = topic240.arrays;
      int target = topic240.target;
      boolean output = topic240.output;
      System.out.println("============== " + target + " ==============");
      boolean result = false;

      int x = 0;
      int y = matrix[0].length - 1;

      while (x < matrix.length && y < matrix[0].length) {
        if (matrix[x][y] == target) {
          result = true;
          break;
        }

        if (matrix[x][y] > target) {
          y--;
          if (y < 0) {
            break;
          }
        } else {
          x++;
          if (x > matrix.length) {
            break;
          }
        }
      }

      printResult("確認", result == output);
    }
  }


}
