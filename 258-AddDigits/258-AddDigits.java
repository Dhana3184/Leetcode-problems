// Last updated: 14/07/2026, 14:18:21
class Solution {
    public int addDigits(int num) {
        int sum;
        while(num>9){
            sum=0;
            while(num>0){
                int dig=num%10;
                sum+=dig;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}