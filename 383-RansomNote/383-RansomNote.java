// Last updated: 14/07/2026, 14:18:01
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(freq[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            freq[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}