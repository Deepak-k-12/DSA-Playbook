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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> demo=new HashSet<>();
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i:nums){
            demo.add(i);
        }
        while(head!=null){
            if(demo.contains(head.val)){
                head=head.next;
                continue;
            }
            curr.next=head;
            curr=curr.next;
            head=head.next;
        }
        curr.next=null;
        return dummy.next;
        

    }
}