// Last updated: 14/07/2026, 14:15:05
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0,sum=0;
        if(costs[0]>coins){
            return 0;
        }
        int i=0;
        while(i<costs.length && sum+costs[i]<=coins){
            sum+=costs[i];
            count++;
            i++;
        }
        return count;
    }
}