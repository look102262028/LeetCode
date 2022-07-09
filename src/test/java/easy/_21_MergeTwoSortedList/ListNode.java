package easy._21_MergeTwoSortedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }


  List<Integer> exampleList = new LinkedList<>();

  ListNode(int[] example) {
    Arrays.stream(example)
        .sorted()
        .forEach(this.exampleList::add);
  }

  ListNode(ListNode next) {
    this.next = next;
    if (next.exampleList.size() != 0) {
      next.exampleList.remove(0);
    }
    this.exampleList = next.exampleList;
  }
}
