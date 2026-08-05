// Last updated: 05/08/2026, 22:29:58
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum=0;
4        int r=mat.length;
5        int c=mat[0].length;
6        for(int i=0;i<r;i++){
7            for(int j=0;j<c;j++){
8                if(i==j || i+j==r-1){
9                    sum+=mat[i][j];
10                }
11            }
12        }
13        return sum;
14    }
15}