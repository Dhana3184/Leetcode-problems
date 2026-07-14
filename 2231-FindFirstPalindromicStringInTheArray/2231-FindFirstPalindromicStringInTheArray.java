// Last updated: 14/07/2026, 14:14:49
class Solution {
    public boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    } 
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}