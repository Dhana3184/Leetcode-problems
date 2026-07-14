// Last updated: 14/07/2026, 14:17:42
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.empty() && nums2[i]>st.peek()){
                h.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        while(!st.empty()){
            h.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=h.get(nums1[i]);
        }
        return nums1;
    }
}
