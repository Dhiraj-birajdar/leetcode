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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null&&root.right==null) return true;
        return isSameTree(root.left,root.right);
    }
    //Same as problem #100. Same tree
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;

        return isSameTree(p.left,q.right) && isSameTree(p.right,q.left);

    }
}