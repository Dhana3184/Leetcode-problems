// Last updated: 14/07/2026, 14:18:09
class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r){
            char temp=s[r];
            s[r]=s[l];
            s[l]=temp;
            l++;
            r--;
        }
    }
}