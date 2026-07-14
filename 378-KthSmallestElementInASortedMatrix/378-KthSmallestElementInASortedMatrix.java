// Last updated: 14/07/2026, 14:18:02
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int[] ans=new int[n*n];
        int ind=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans[ind++]=matrix[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}