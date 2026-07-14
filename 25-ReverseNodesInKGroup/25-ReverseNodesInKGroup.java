// Last updated: 14/07/2026, 14:20:11
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        dummy.next=head;
        while(true){
            ListNode start=prev.next;
            ListNode end=prev;
            for(int i=0;i<k;i++){
                end=end.next;
                if(end==null){
                    return dummy.next;
                }
            }
            ListNode ng=end.next;
            ListNode a=ng,b=start,c=b.next;
            while(b!=ng){
                b.next=a;
                a=b;
                b=c;
                if(c!=null){
                    c=c.next;
                }
            }
            prev.next=end;
            prev=start;
        }
    }
}
