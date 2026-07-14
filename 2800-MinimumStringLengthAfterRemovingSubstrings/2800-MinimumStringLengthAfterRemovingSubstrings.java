// Last updated: 14/07/2026, 14:14:29
class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty() && (st.peek()=='A' && s.charAt(i)=='B')){
                st.pop();
            }else if(!st.empty() && (st.peek()=='C' && s.charAt(i)=='D')){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}