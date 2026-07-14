// Last updated: 14/07/2026, 14:15:20
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq=new int[26];
        for(int i=0;i<allowed.length();i++){
            freq[allowed.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            boolean flag=true;
            for(int j=0;j<word.length();j++){
                if(freq[word.charAt(j)-'a']==0){
                    flag=false;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}