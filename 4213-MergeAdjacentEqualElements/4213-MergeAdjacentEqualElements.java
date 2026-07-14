// Last updated: 14/07/2026, 14:13:37
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            long curr=nums[i];
            while(!st.isEmpty() && st.peek()==curr){
                curr+=st.pop();
            }
            st.push(curr);
        }
        return new ArrayList<>(st);
    }
}