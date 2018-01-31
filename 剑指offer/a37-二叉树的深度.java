/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//递归版本
public class Solution {
        public int TreeDepth(TreeNode pRoot)
        {
            if(pRoot == null){
                return 0;
            }
            int left = TreeDepth(pRoot.left);
            int right = TreeDepth(pRoot.right);
            return Math.max(left, right) + 1;
        }
    }