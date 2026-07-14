// Last updated: 14/07/2026, 14:15:13
class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}