/* Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them. */



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        int lheight = height(root.left);
        int rheight = height(root.right);
        
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);
        
        return Math.max(lheight+rheight,
                       Math.max(ldiameter,rdiameter));
        
    }
    
    public int height(TreeNode node){
        if(node == null)
            return 0;
         return (1+Math.max(height(node.left), height(node.right)));
    }
}
