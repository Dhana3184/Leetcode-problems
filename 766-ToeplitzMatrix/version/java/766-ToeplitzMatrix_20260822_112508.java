// Last updated: 22/08/2026, 11:25:08
1class Solution {
2    public boolean isToeplitzMatrix(int[][] matrix) {
3        for(int i=1;i<matrix.length;i++){
4            for(int j=1;j<matrix[i].length;j++){
5                if(matrix[i][j]!=matrix[i-1][j-1]){
6                    return false;
7                }
8            }
9        }
10        return true;
11    }
12}