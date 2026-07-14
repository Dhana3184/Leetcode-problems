// Last updated: 14/07/2026, 14:15:50
class Solution {
    public int divisorSubstrings(int num, int k) {
        String st=String.valueOf(num);
        int count=0;
        for(int i=0;i<=st.length()-k;i++){
            String sub=st.substring(i,i+k);
            int d=Integer.parseInt(sub);
            if(d!=0 && num%d==0){
                count++;
            }
        }
        return count;
    }
}