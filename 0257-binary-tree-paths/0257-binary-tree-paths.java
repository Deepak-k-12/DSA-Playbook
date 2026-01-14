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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        String a="->";
        StringBuilder sb=new StringBuilder();
        // sb.append(root.val);
        check(root,a,sb,ans);
        return ans;
    }


   public void check(TreeNode root, String a, StringBuilder sb, List<String> ans) {
    if (root == null) {
        
        return;}

    int len = sb.length();   
    if (root.left == null && root.right == null) {
        sb.append(root.val);
        ans.add(sb.toString());
        sb.setLength(len);  
        return;
    }

    sb.append(root.val + a);

    check(root.left, a, sb, ans);
    check(root.right, a, sb, ans);

    sb.setLength(len); 
}}