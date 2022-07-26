package medium._236_LowestCommonAncestor;

import leetcode.LeetcodeTest;

public class Chun_236 extends LeetcodeTest {

  @Override
  public void main() {
    TreeNode treeNode = lowestCommonAncestor(new TreeNode(3), new TreeNode(5), new TreeNode(1));
  }

  private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null) {
      return root;
    }
    return left != null ? left : right;
  }
}
