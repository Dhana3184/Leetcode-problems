// Last updated: 14/07/2026, 14:16:01
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }else{
                count=0;
            }
            if(count==3){
                return true;
            }
        }
        return false;
    }
}