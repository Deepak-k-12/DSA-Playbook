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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        int in=1;
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            int l=q.size();
            int sum=0;
            
            for(int j=0;j<l;j++){
            TreeNode n=q.poll();
            sum+=n.val;
            if(n.left!=null){
                q.offer(n.left);
            }
            if(n.right!=null){
                q.offer(n.right);
            }
            }
            if(max<sum){
                max=sum;
                in=i;
            }
            i++;
           
           
        }
        return in;
    }
}