package easy._21_MergeTwoSortedList;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Chun_21 extends LeetcodeTest {

  static {
    leetcodeMission = new _21_Mission();
  }

  @DisplayName("Merge 2 個 LinkedList")
  public void main() {
    for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
      _21_Mission.Topic21 topic21 = (_21_Mission.Topic21) topic;
      ListNode list1 = topic21.list1;
      ListNode list2 = topic21.list2;
      List<String> result = new LinkedList<>();

      // 解答
      ListNode outputResult = this.recursive(list1, list2, result);

      // 檢查
      String resultStr = String.join(",", result);
      String output = topic21.output.stream().map(String::valueOf).collect(Collectors.joining(","));
      print(String.format("result:%s, output:%s", resultStr, output));
      final boolean flag = resultStr.contains(output);
      printResult(flag ? "Success" : "Error", flag);
    }
  }

  private ListNode recursive(ListNode list1, ListNode list2, List<String> result) {
    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    // for test
    final List<Integer> exampleList1 = list1.exampleList;
    final List<Integer> exampleList2 = list2.exampleList;
    final int size1 = exampleList1.size();
    final int size2 = exampleList2.size();
    if(size1 == 0 && size2 ==0){
      return new ListNode();
    }

    int val1 = exampleList1.stream().findFirst().orElse(1024);
    int val2 = exampleList2.stream().findFirst().orElse(1024);

    if (val1 > val2) {
      result.add(String.valueOf(val2));
      list2 = new ListNode(list2);
    } else {
      result.add(String.valueOf(val1));
      list1 = new ListNode(list1);
    }

    return this.recursive(list1, list2, result);
  }
}
