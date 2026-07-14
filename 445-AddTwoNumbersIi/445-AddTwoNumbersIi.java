// Last updated: 14/07/2026, 14:17:50
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        while(l1!=null){
             st1.push(l1.val);
              l1=l1.next;
        }
        while(l2!=null){
             st2.push(l2.val);
              l2=l2.next;
        }
        int carry=0;
        ListNode dummy=new ListNode(0);
        while(!st1.empty() || !st2.empty() || carry!=0){
            int sum=carry;
            if(!st1.empty()){
                sum+=st1.pop();
            } 
            if(!st2.empty()){
                sum+=st2.pop();
            }
            ListNode newNode=new ListNode(sum%10);
            newNode.next=dummy.next;
            dummy.next=newNode;
            carry=sum/10;
        }
        return dummy.next;
    }
}
