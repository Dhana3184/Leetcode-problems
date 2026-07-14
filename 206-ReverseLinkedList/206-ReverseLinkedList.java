// Last updated: 14/07/2026, 14:18:44
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
    public ListNode reverseList(ListNode head) {
        /*ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;*/
        if(head==null || head.next==null){
            return head;
        }
        ListNode a=null,b=head,c=head.next;
        while(b!=null){
            b.next=a;
            a=b;
            b=c;
            if(c!=null){
                c=c.next;
            }
        }
        return a;
    }
}
