// Last updated: 14/07/2026, 14:16:51
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String word=s+s;
        if(word.contains(goal)){
            return true;
        }
        return false;
    }
}