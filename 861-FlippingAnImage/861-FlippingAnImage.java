// Last updated: 14/07/2026, 14:16:47
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] arr=new int[n][n];
        for(int i=0;i<image.length;i++){
            int l=0;
            int r=image[i].length-1;
            while(l<r){
                int temp=image[i][l];
                image[i][l]=image[i][r];
                image[i][r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }else{
                    image[i][j]=1;
                }
            }
        }
        return image;
    }
}