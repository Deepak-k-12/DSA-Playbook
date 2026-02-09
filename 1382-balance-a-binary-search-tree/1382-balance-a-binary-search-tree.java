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
    ArrayList<Integer> arr =new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return construct(0,arr.size()-1);
    }

    public void inorder(TreeNode root){
        if(root==null){return ;}
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }

    public TreeNode construct(int st,int en){
        if(st>en){return null;}

        int mid=(st+en)/2;

        TreeNode node =new TreeNode(arr.get(mid));

        node.left=construct(st,mid-1);
        node.right=construct(mid+1,en);

        return node;
    }
}