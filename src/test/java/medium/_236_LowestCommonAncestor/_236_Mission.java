package medium._236_LowestCommonAncestor;

import leetcode.LeetcodeMission;

import java.util.Arrays;
import java.util.List;

public class _236_Mission extends LeetcodeMission {

  public _236_Mission() {
    List<Integer> nums = Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
    this.setTopic(new Topic236(new TreeNode(0), new TreeNode(5), new TreeNode(1), new TreeNode(3)));
  }

  private int levelTotalCount(int level){
    int totalCount = 1;
    int count = 1;
    for (int i = 1; i < level; i++) {
      count = count *2;
      totalCount = totalCount + count;
    }
    return totalCount;
  }

  static class Topic236 extends Topic {

    TreeNode root;
    TreeNode p;
    TreeNode q;
    TreeNode output;

    public Topic236(TreeNode root, TreeNode p, TreeNode q, TreeNode output) {
      this.root = root;
      this.p = p;
      this.q = q;
      this.output = output;
    }
  }
}
