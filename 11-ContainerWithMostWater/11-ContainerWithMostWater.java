// Last updated: 14/07/2026, 14:20:24
class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxArea=0;
        while(l<r){
            int width=r-l;
            int h=Math.min(height[r],height[l]);
            maxArea=Math.max(maxArea,width*h);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}