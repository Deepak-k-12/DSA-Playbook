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

class Pair{
    TreeNode a;
    boolean b;
    Pair(TreeNode a,boolean b){
        this.a=a;
        this.b=b;
    }
}

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        
        int sum=0;
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(root,false));
        
        while(!q.isEmpty()){
            Pair p=q.poll();
            boolean ba=p.b;
            TreeNode ab=p.a;
            if(ab.left==null && ab.right==null && ba){
                sum+=ab.val;
            }
            if(ab.left!=null){
                q.offer(new Pair(ab.left,true));
            }
             if(ab.right!=null){
                q.offer(new Pair(ab.right,false));
            }
        }
        return sum;
    }
}