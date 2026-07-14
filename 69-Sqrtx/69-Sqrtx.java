// Last updated: 14/07/2026, 14:19:45
class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int si=1,li=x/2,mid=0,res=-1;
        while(si<=li){
            mid=(si+li)/2;
            long m=(long)mid*mid;
            if(m==x){
                return mid;
            }else if(m<x){
                res=mid;
                si=mid+1;
            }else{
                li=mid-1;
            }
        }
        return res;
    }
}
