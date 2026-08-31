// Last updated: 31/08/2026, 14:38:21
1class Solution {
2    public int getMaximumGenerated(int n) {
3        if(n==0){
4            return 0;
5        }
6        int[] nums=new int[n+1];
7        nums[0]=0;
8        nums[1]=1;
9        for(int i=1;i<=n/2;i++){
10            if(2*i<=n){
11                nums[2*i]=nums[i];
12            }
13            if(2*i+1<=n){
14                nums[2*i+1]=nums[i]+nums[i+1];
15            }
16        }
17        int max=Integer.MIN_VALUE;
18        for(int i=0;i<=n;i++){
19            max=Math.max(max,nums[i]);
20        }
21        return max;
22    }
23}