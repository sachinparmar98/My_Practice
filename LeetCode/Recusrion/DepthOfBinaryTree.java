import java.sql.Time;

import javax.swing.tree.TreeNode;

public class DepthOfBinaryTree {
    int max = 0;

    public int maxDepth(TreeNode root) {
        return depthCount(root, 0);
    }

    public int depthCount(TreeNode root, int count) {

        if (root == null)
            return max;
        if (max < ++count)
            max = count;
        depthCount(root.left, count);
        depthCount(root.right, count);
        count--;
        return max;

    }

}

// below code for less memory consume;
public int maxDepth(TreeNode root) {

    if (root == null)
        return 0;

    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    return 1 + Math.max(leftDepth, rightDepth);

}
/* 
Time and Space Complexity
Time Complexity: O(n) — every node is visited exactly once.
Space Complexity: O(h) — due to the recursion call stack, where
 h is the height of the tree. In the worst case (a skewed tree),
  this is O(n); for a balanced tree, it is O(log n).
*/