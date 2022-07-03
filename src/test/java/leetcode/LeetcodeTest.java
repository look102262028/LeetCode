package leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.util.StopWatch;

public abstract class LeetcodeTest implements LeetcodeInterface {

  final StopWatch stopWatch = new StopWatch();

  @BeforeEach
  public void startTest() {
    stopWatch.start(this.getClass().getSimpleName());
  }

  @AfterEach
  public void finishTest() {
    stopWatch.stop();
    System.out.println(stopWatch.prettyPrint());
  }

  public void printResult(String result, boolean flag) {
    (flag ? System.out : System.err).println(result);
  }
}
