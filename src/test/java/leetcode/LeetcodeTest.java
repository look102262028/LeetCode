package leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

public abstract class LeetcodeTest implements LeetcodeInterface {

  final StopWatch stopWatch = new StopWatch();
  public static LeetcodeMission leetcodeMission = new LeetcodeMission();

  @Test
  public void run() {
    main();
  }


  @BeforeEach
  public void startTest() {
    stopWatch.start(this.getClass().getSimpleName());
  }

  @AfterEach
  public void finishTest() {
    stopWatch.stop();
    System.out.println(stopWatch.prettyPrint());
  }

  public abstract void main();

  public void printResult(String result, boolean flag) {
    (flag ? System.out : System.err).println(result);
  }

}
