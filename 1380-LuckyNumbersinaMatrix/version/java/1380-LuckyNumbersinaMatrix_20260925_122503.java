// Last updated: 25/09/2026, 12:25:03
1class Solution {
2    public List<Integer> luckyNumbers(int[][] matrix) {
3        List<Integer> ls=new ArrayList<>();
4        for(int i=0;i<matrix.length;i++){
5            int min=matrix[i][0];
6            int col=0;
7            for(int j=0;j<matrix[i].length;j++){
8                if(matrix[i][j]<min){
9                    min=matrix[i][j];
10                    col=j;
11                }
12            }
13            boolean isSaddle=true;
14            int max=min;
15            for(int k=0;k<matrix.length;k++){
16                if(matrix[k][col]>max){
17                    isSaddle=false;
18                    break;
19                }
20            }
21            if(isSaddle){
22                ls.add(max);
23            }
24        }
25        return ls;
26    }
27}