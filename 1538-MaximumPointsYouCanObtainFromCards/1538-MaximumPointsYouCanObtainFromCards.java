// Last updated: 14/07/2026, 14:15:45
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[n-i-1]-cardPoints[k-i-1];
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
