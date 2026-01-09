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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null){return null;}
        Queue<TreeNode> ls=new LinkedList<>();
        List<List<TreeNode>> li=new ArrayList<>();
        ls.add(root);
        while(!ls.isEmpty()){
            int l=ls.size();
            List<TreeNode> temp=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode node=ls.poll();
                temp.add(node);

                if(node.left!=null){
                    ls.add(node.left);
                }
                if(node.right!=null){
                    ls.add(node.right);
                }
            }
            li.add(temp);
        }

        int n=li.size();
        int n1=li.get(n-1).size();
        if(li.get(n-1).size()==1){return li.get(n-1).get(0);}
        TreeNode a=li.get(n-1).get(0);
        TreeNode b=li.get(n-1).get(n1-1);

        return check(root,a,b);
    }

    public TreeNode check(TreeNode root,TreeNode p,TreeNode q){
       if(root==null || p==root || q==root){
            return root;
        }
        TreeNode l=check(root.left,p,q);
        TreeNode r=check(root.right,p,q);
        if(l==null){
            return r;
        }
        else if(r==null){
            return l;
        }
        else{
            return root;
        }
}}