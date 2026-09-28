// Last updated: 28/09/2026, 11:28:29
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int n=mat.length;
4        for(int r=0;r<4;r++){
5            boolean same=true;
6            for(int i=0;i<n;i++){
7                for(int j=0;j<n;j++){
8                    if(mat[i][j]!=target[i][j]){
9                        same=false;
10                        break;
11                    }
12                }
13                if(!same){
14                    break;
15                }
16            }
17            if(same){
18                return true;
19            }
20            int[][] rotated=new int[n][n];
21            for(int i=0;i<n;i++){
22                for(int j=0;j<n;j++){
23                    rotated[j][n-i-1]=mat[i][j];
24                }
25            }
26            mat=rotated;
27        }
28        return false;
29    }
30}