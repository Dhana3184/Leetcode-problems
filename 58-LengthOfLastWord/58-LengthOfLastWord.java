// Last updated: 14/07/2026, 14:19:49
class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.split(" ");
        String st1=st[st.length-1];
        return st1.length();
    }
}