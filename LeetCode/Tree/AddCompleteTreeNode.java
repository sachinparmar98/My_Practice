package Tree;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// Tc will be O(n) this is not good we want less then o(n)
public class AddCompleteTreeNode {
     public int solve(TreeNode root, int count) {
          if (root == null)
               return count;
          count++;
          count = solve(root.left, count);
          count = solve(root.right, count);
          return count;

     }

     public int countNodes(TreeNode root) {

          return solve(root, 0);// 0 beacause we assume root is zero if it is not zero solve functio check it

     }

     // we can do it in single function Tc=O(n) but we want less then O(n)
     /*
      * public int countNodes(TreeNode root)
      * {
      * if(root==null)return 0;
      * int leftNodeSum=countNode(root.left);
      * int rightNodeSum=countNode(root.right);
      * return leftNodeSum+rightNodeSum+1;
      * }
      * 
      */
     // we will code this problem (logn square) time complexity
     // few points to know before we start
     // when an tree last child is left side of its parents means tree is complete
     // binary tree
     // when an tree left node is equal to right node means it is an perfect binary
     // tree
     // when tree is perfect binary tree then its total no. of nodes is equal to its
     // [2power its height -1]
     // example if tree height is 2 then total node is[2*2-1]=3 total nodes is 3

     public int findLeftHeight(TreeNode root) {
          TreeNode temp = root;
          int count = 0;
          while (root != null) {
               temp = temp.left;
               count++;
          }
          return count;

     }

     public int findRightHeight(TreeNode root) {
          TreeNode temp = root;
          int count = 0;
          while (root != null) {
               temp = temp.right;
               count++;
          }
          return count;

     }

     public int countNodes(TreeNode root) {
          if (root == null)
               return 0;

          int leftHeight = findLeftHeight(root.left);
          int rightHeight = findRightHeight(root.right);
          if (leftHeight == rightHeight)
               return (int) (Math.pow(leftHeight, rightHeight) - 1);
          return (countNodes(root.left) + countNodes(root.right) + 1);

     }

}