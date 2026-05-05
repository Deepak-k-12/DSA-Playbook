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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){return head;}
        ListNode temp=head;
        int c=1;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%c;
        if(k==0){
            temp.next=null;
            return head;
        }
        int c1=c-k;
        temp=head;
        int s1=1;
        while(temp.next!=null){
            if(s1==c1){
                head=temp.next;
                temp.next=null;
                break;
            }
            s1++;
            temp=temp.next;
        }
        return head;
    }
}