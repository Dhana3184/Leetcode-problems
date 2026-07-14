// Last updated: 14/07/2026, 14:20:33
class Solution {
    public boolean isPalindrome(String st){
        int l=0,r=st.length()-1;
        while(l<r){
            if(st.charAt(l)!=st.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String longest="";
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)){
                    if(sub.length()>longest.length()){
                        longest=sub;
                    }
                }
            }
        }
        return longest;
    }
}

