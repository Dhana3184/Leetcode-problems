// Last updated: 31/07/2026, 12:14:33
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] arr=new int[heights.length];
4        for(int i=0;i<heights.length;i++){
5            arr[i]=heights[i];
6        }
7        Arrays.sort(arr);
8        int count=0;
9        for(int i=0;i<heights.length;i++){
10            if(heights[i]!=arr[i]){
11                count++;
12            }
13        }
14        return count;
15    }
16}