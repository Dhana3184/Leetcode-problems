// Last updated: 15/09/2026, 11:47:29
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> st=new Stack<>();
4        int n=heights.length;
5        int maxArea=0;
6        for(int i=0;i<=n;i++){
7            int curr=(i==n)?0:heights[i];
8            while(!st.isEmpty() && curr<heights[st.peek()]){
9                int height=heights[st.pop()];
10                int width;
11                if(st.isEmpty()){
12                    width=i;
13                }else{
14                    width=i-st.peek()-1;
15                }
16                maxArea=Math.max(maxArea,height*width);
17            }
18            st.push(i);
19        }
20        return maxArea;
21    }
22}