// Last updated: 14/09/2026, 20:55:57
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int left=0,right=n-1;
5        int leftmax=0,rightmax=0;
6        int water=0;
7        while(left<=right){
8            if(height[left]<=height[right]){
9                if(height[left]>=leftmax){
10                    leftmax=height[left];
11                }else{
12                    water+=leftmax-height[left];
13                }
14                left++;
15            }else{
16                if(height[right]>=rightmax){
17                    rightmax=height[right];
18                }else{
19                    water+=rightmax-height[right];
20                }
21                right--;
22            }
23        }
24        return water;
25    }
26}