// Last updated: 14/07/2026, 14:13:53
class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                a++;
            }else{
                b++;
            }
        }
        if(a==0 || b==0){
            return s.length();
        }
        return Math.abs(a-b);
    }
}