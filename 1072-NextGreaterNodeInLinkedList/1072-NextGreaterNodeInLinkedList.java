// Last updated: 14/07/2026, 14:16:25
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
    public int[] nextLargerNodes(ListNode head) {
        /*HashMap<ListNode,Integer> h=new HashMap<>();
        Stack<ListNode> st=new Stack<>();
        ListNode curr=head,x=null;
        int n=0;
        while(curr!=null){
            if(st.empty()){
                st.push(curr);
            }else{
                while(!st.empty() && curr.val>st.peek().val){
                    x=st.pop();
                    h.put(x,curr.val);
                }
                st.push(curr);
                curr=curr.next;
                n++;
            }
        }
        while(!st.empty()){
            h.put(st.pop(),0);
        }
        int[] arr=new int[n];
        curr=head;
        int i=0;
        while(curr!=null){
            arr[i]=h.get(curr);
            curr=curr.next;
            i++;
        }
        return arr;*/
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        ListNode current=head;
        while(current!=null){
            al.add(current.val);
            current=current.next;
        }
        int n=al.size();
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            int x=al.get(i);
            while(!st.empty() && x>=st.peek()){
                st.pop();
            }
            if(st.empty()){
                res[i]=0;
            }else{
                res[i]=st.peek();
            }
            st.push(x);
        }
        return res;
    }
}
