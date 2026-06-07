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
    public TreeNode createBinaryTree(int[][] des) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int i[]:des){
            int parent=i[0];
            int child=i[1];
            int isLeft=i[2];

            map.putIfAbsent(parent,new TreeNode(parent));
            map.putIfAbsent(child,new TreeNode(child));

            TreeNode p=map.get(parent);
            if(isLeft==1){
                p.left=map.get(child);
            }
            else{
                p.right=map.get(child);
            }   

            set.add(child);
            
        }

        for(int i[]:des){
            if(!set.contains(i[0])){
                return map.get(i[0]);
            }
        }
        return null;
    }
}