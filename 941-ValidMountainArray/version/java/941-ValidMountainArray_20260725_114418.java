// Last updated: 25/07/2026, 11:44:18
1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        if(arr.length<3){
4            return false;
5        }
6        int n=arr.length;
7        int i=0;
8        while(i<n-1 && arr[i]<arr[i+1]){
9            i++;
10        }
11        if(i==0 || i==n-1){
12            return false;
13        }
14        while(i<n-1 && arr[i]>arr[i+1]){
15            i++;
16        }
17        return i==n-1;
18    }
19}