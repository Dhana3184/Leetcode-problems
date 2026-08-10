// Last updated: 10/08/2026, 21:42:43
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy=new ListNode(0);
14        ListNode curr=dummy;
15        int carry=0;
16        while(l1!=null || l2!=null || carry>0){
17            int d1=(l1!=null)?l1.val:0;
18            int d2=(l2!=null)?l2.val:0;
19            int sum=d1+d2+carry;
20            carry=sum/10;
21            curr.next=new ListNode(sum%10);
22            curr=curr.next;
23            if(l1!=null){
24                l1=l1.next;
25            }
26            if(l2!=null){
27                l2=l2.next;
28            }
29        }
30        return dummy.next;
31    }
32}