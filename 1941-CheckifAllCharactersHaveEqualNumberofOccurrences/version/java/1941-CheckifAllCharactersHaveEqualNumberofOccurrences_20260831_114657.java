// Last updated: 31/08/2026, 11:46:57
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] freq = new int[26];
        if(s.length()==0){
            return true;
        }
        
       for(char ch:s.toCharArray()){
            freq[ch-'a']++;
       }
       int count = 0;
       for(int i=0;i<26;i++){
          
          if(freq[i]==0){
            continue;
          }
          if(freq[i]!=0 && count==0){
             count = freq[i];
          }
          else if(freq[i]!=count){
             return false;
          }
       }
       return true;
    }
}