// Last updated: 14/07/2026, 14:14:55
class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=word.indexOf(ch);
        String rev="";
        for(int i=ind;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        String res=rev+word.substring(ind+1,word.length());
        return res;
    }
}