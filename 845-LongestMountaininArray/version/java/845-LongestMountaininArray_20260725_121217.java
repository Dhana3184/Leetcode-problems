// Last updated: 25/07/2026, 12:12:17
1class Solution {
2    public int longestMountain(int[] arr) {
3        int n=arr.length;
4        int max=0;
5        for(int i=1;i<n-1;i++){
6            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
7                int left=i;
8                int right=i;
9                while(left>0 && arr[left]>arr[left-1]){
10                    left--;
11                }
12                while(right<n-1 && arr[right]>arr[right+1]){
13                    right++;
14                }
15                max=Math.max(max,right-left+1);
16            }
17        }
18        return max;
19    }
20}