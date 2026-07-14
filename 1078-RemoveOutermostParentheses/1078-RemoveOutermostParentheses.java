// Last updated: 14/07/2026, 14:16:24
class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count!=0){
                    res.append(s.charAt(i));
                }
                count++;
            }else{
                if(count!=1){
                    res.append(s.charAt(i));
                }
                count--;
            }  
        }
        return res.toString();
    }
}