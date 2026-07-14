// Last updated: 14/07/2026, 14:14:46
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int add=0;
        int ind=1;
        for(int i=cost.length-1;i>=0;i--){
            if(ind%3!=0){
                add+=cost[i];
            }
            ind++;
        }
        return add;
    }
}