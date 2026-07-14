// Last updated: 14/07/2026, 14:14:12
class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'a']++;
            while(freq[s.charAt(right)-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}