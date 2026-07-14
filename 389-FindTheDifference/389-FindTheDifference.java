// Last updated: 14/07/2026, 14:17:58
class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            res=(char)(res^ch);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            res=(char)(res^ch);
        }
        return res;
    }
}