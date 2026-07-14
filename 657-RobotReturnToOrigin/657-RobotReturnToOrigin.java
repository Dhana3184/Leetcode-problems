// Last updated: 14/07/2026, 14:17:25
class Solution {
    public boolean judgeCircle(String moves) {
        int uc=0,rc=0;
        char[] arr=moves.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(ch=='U'){
                uc++;
            }else if(ch=='D'){
                uc--;
            }else if(ch=='R'){
                rc++;
            }else{
                rc--;
            }
        }
       return uc==0 && rc==0;
    }
}