/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ModifiedList(int[] nums, ListNode head) {
        HashSet<int> demo=new HashSet<int>(nums);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(head!=null){
            if(demo.Contains(head.val)){
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