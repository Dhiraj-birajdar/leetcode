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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        getLeafs(root1,r1);
        getLeafs(root2,r2);
        return r1.equals(r2);
    }
    public void getLeafs(TreeNode root, List<Integer> li){
        if(root == null) return;
        if(root.left == null && root.right == null){
            li.add(root.val);
            return;
        }        
        getLeafs(root.left,li);        
        getLeafs(root.right,li);
    }
    
}