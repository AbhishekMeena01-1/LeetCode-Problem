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
class Solution {
    int length=0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return length;

    }
    public int diameter(TreeNode root){
        if(root==null)return 0;
        int left=diameter(root.left);
        int right=diameter(root.right);
        length=Math.max(length,left+right);
        return Math.max(left,right)+1;
    }
}