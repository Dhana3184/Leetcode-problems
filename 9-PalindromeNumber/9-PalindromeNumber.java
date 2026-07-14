// Last updated: 14/07/2026, 14:20:26
class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int rev=0;
        while(x>0){
            int dig=x%10;
            x=x/10;
            rev=rev*10+dig;
        }
        if(rev==a){
            return true;
        }else{
            return false;
        }
    }
}