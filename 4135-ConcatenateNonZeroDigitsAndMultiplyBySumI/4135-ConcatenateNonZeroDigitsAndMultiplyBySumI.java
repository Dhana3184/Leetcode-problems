// Last updated: 14/07/2026, 14:13:33
class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int a=n;
        while(a>0){
            int d=a%10;
            sum+=d;
            a/=10;
        }
        String st=String.valueOf(n);
        String res="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)!='0'){
                res+=st.charAt(i);
            }
        }
        if(res.length()==0){
            return 0;
        }
        long r=Long.parseLong(res);
        return sum*r;
    }
}