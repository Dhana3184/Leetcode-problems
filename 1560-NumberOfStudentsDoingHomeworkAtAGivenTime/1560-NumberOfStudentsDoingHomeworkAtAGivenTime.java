// Last updated: 14/07/2026, 14:15:43
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                count++;
            }
        }
        return count;
    }
}