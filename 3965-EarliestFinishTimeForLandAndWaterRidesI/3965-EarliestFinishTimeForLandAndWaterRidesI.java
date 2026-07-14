// Last updated: 14/07/2026, 14:13:43
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int landFin=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                int waterStart=Math.max(landFin,waterStartTime[j]);
                int waterFin=waterStart+waterDuration[j];
                ans=Math.min(ans,waterFin);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            int waterFinish=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<landStartTime.length;j++){
                int landStart=Math.max(waterFinish,landStartTime[j]);
                int landFinish=landStart+landDuration[j];
                ans=Math.min(ans,landFinish);
            }
        }
        return ans;
    }
}