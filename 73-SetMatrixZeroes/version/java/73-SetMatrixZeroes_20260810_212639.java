// Last updated: 10/08/2026, 21:26:39
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        boolean[] rows=new boolean[matrix.length];
4        boolean[] col=new boolean[matrix[0].length];
5        for(int i=0;i<matrix.length;i++){
6            for(int j=0;j<matrix[0].length;j++){
7                if(matrix[i][j]==0){
8                    rows[i]=true;
9                    col[j]=true;
10                }
11            }
12        }
13        for(int i=0;i<matrix.length;i++){
14            for(int j=0;j<matrix[0].length;j++){
15                if(rows[i]==true || col[j]==true){
16                    matrix[i][j]=0;
17                }
18                System.out.print(matrix[i][j]+" ");
19            }
20            System.out.println();
21        }
22    }
23}