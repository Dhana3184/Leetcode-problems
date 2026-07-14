// Last updated: 14/07/2026, 14:17:57
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        for(int j=0;j<t.length();j++){
            if(i<s.length() && s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        return i==s.length();
    }
}