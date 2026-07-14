// Last updated: 14/07/2026, 14:19:10
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            int a=0,b=0;
            if(s.equals("+")){
                a=st.pop();
                b=st.pop();
                st.push(a+b);
            }else if(s.equals("-")){
                a=st.pop();
                b=st.pop();
                st.push(b-a);
            }else if(s.equals("*")){
                a=st.pop();
                b=st.pop();
                st.push(b*a);
            }else if(s.equals("/")){
                a=st.pop();
                b=st.pop();
                st.push(b/a);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}