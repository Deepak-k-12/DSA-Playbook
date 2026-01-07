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
    long max=0;
    public int maxProduct(TreeNode root) {
        int mod=1000000007;
        long sum=check1(root);
        System.out.println(sum);
        check(root,mod,sum);
        return (int)(max % mod);
    }

    public long check(TreeNode root,int mod,long sum){
        if(root==null){return 0;}

        long left=check(root.left,mod,sum);
        long right=check(root.right,mod,sum);
        long curr=root.val+left+right;
        long currsum=(long)curr*(sum-curr);
        max=Math.max(max,currsum);
        return curr;
    }

    public long check1(TreeNode root){
        if(root==null){return 0;}

        return check1(root.left)+root.val+check1(root.right);
    }
}