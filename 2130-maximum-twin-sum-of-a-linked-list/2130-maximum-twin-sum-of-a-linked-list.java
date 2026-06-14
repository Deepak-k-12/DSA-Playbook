/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> demo=new ArrayList<>();
        if(head==null){return 0;}
        ListNode temp=head;
        while(temp!=null){
            demo.add(temp.val);
            temp=temp.next;
        }
        int sum=0,m=0;
        for(int i=0;i<(demo.size()/2);i++){
            sum=demo.get(i)+demo.get(demo.size()-1-i);
            m=Math.max(m,sum);
        }
        return m;
    }
}