package medium._513_bottomLeftTreeValue;

import leetcode.LeetcodeMission;
import leetcode.LeetcodeTest;
import org.junit.jupiter.api.DisplayName;

public class Chun_513 extends LeetcodeTest {

    static {
        leetcodeMission = new _513_Mission();
    }

    @DisplayName("二叉樹 ")
    public void main() {
        for (LeetcodeMission.Topic topic : leetcodeMission.getTopicList()) {
            _513_Mission.Topic513 topic513 = (_513_Mission.Topic513) topic;
            TreeNode root = new TreeNode();
            int returnVal;
            // 解法
            if(root == null){
                returnVal = 0;
                return;
            }
            
            Cache cache = new Cache(1,root.val);
            recursive(root, 2, cache);
            returnVal = cache.val;
        }
    }

    private void recursive(TreeNode root, int deep, Cache cache){
        if(root == null) return;;

        if(root.right == null && root.left == null && deep > cache.deep){
            cache.deep = deep;
            cache.val = root.val;
        }

        recursive(root.left, deep+1, cache);
        recursive(root.right, deep+1, cache);
    }

    static class Cache {

        int deep;
        int val;

        public Cache(int deep, int val) {
            this.deep = deep;
            this.val = val;
        }
    }
}
