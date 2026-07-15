package Tree;

import javax.swing.tree.TreeNode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class AddCompleteTreeNode {
    public int solve(TreeNode root,int count)
   {
        if(root==null)return count;
         count++;
     count=   solve(root.left,count);
      count=  solve(root.right,count);
        return count;

   }
    public int countNodes(TreeNode root) {
       
         return solve(root,0);//0 beacause we assume root is zero  if it is not zero solve functio check it

    }


    
}

//we can do it in single function 
/*
  public int countNodes(TreeNode root)
  {
       if(root==null)return 0;
       int leftNodeSum=countNode(root.left);
       int rightNodeSum=countNode(root.right);
       return leftNodeSum+rightNodeSum+1;
  }

 */
