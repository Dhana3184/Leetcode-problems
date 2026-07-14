// Last updated: 14/07/2026, 14:13:45
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weight.length;i++){
            max=Math.max(max,weight[i]);
            if(weight[i]<max){
                c++;
                max=0;
            }
        }
        return c;
    }
}