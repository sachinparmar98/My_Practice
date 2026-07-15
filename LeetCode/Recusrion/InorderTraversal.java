import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class InorderTraversal {
    public static void main(String[] args) {

    }

    List<Integer> l = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return l;
        inorderTraversal(root.left);
        l.add(root.val);
        inorderTraversal(root.right);
        return l;

    }
}
