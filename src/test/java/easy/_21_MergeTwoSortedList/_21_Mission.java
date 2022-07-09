package easy._21_MergeTwoSortedList;

import leetcode.LeetcodeMission;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _21_Mission extends LeetcodeMission {

  public _21_Mission() {
    ListNode list1_1 = new ListNode(new int[]{1, 2, 4});
    ListNode list1_2 = new ListNode(new int[]{1, 3, 4});
    List<Integer> output1 = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 4, 4));
    this.setTopic(new Topic21(list1_1, list1_2, output1));

    ListNode list2_1 = new ListNode();
    ListNode list2_2 = new ListNode();
    List<Integer> output2 = new LinkedList<>();
    this.setTopic(new Topic21(list2_1, list2_2, output2));

    ListNode list3_1 = new ListNode();
    ListNode list3_2 = new ListNode(new int[]{0});
    List<Integer> output3 = new LinkedList<>(Collections.singletonList(0));
    this.setTopic(new Topic21(list3_1, list3_2, output3));
  }

  static class Topic21 extends LeetcodeMission.Topic {
    ListNode list1;
    ListNode list2;
    List<Integer> output;

    public Topic21(ListNode list1, ListNode list2, List<Integer> output) {
      this.list1 = list1;
      this.list2 = list2;
      this.output = output;
    }
  }

}
