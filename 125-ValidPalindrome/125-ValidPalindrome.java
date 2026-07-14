// Last updated: 14/07/2026, 14:19:24
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int l = 0, r = n-1;
        while(l<r){
            char left = s.charAt(l);
            char right = s.charAt(r);
            if(!Character.isLetterOrDigit(left)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                r--;
                continue;
            }

            if(left!=right) return false;
            l++;
            r--;
        }
        return true;
    }
}