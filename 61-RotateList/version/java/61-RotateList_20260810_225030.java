// Last updated: 10/08/2026, 22:50:30
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null || head.next==null || k==0){
14            return head;
15        }
16        int n=0;
17        ListNode tail=head;
18        while(tail.next!=null){
19            tail=tail.next;
20            n++;
21        }
22        n++;
23        k=k%n;
24        if(k==0){
25            return head;
26        }
27        tail.next=head;
28        ListNode newTail=head;
29        for(int i=1;i<n-k;i++){
30            newTail=newTail.next;
31        }
32        ListNode newHead=newTail.next;
33        newTail.next=null;
34        return newHead;
35    }
36}