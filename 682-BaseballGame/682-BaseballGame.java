// Last updated: 14/07/2026, 14:17:20
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("C")){
                st.pop();
            }else if(ch.equals("D")){
                st.push(st.peek()*2);
            }else if(ch.equals("+")){
                int n1=st.pop();
                int n2=n1+st.peek();
                st.push(n1);
                st.push(n2);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        int total=0;
        while(!st.empty()){
            total+=st.pop();
        }
        return total;
    }
}