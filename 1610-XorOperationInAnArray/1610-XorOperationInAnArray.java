// Last updated: 14/07/2026, 14:15:32
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            res=res^(start+2*i);
        }
        return res;
    }
}