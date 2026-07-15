import javax.swing.tree.TreeNode;

public class MinimumDepthOfBalanceTree {
        public int minDepth(TreeNode root) {

            if(root==null)return 0;
            int letfDepth=minDepth(root.left);
            int rightDepth=minDepth(root.right);
            return  1+Math.min(leftDepth,rightDepth);
            
        }
}
