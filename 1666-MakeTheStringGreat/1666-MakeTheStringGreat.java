// Last updated: 14/07/2026, 14:15:24
class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32){
                st.pop();
            }else{
                st.push(ch);;
            }
        }
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}