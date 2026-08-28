// Last updated: 28/08/2026, 12:17:49
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        for(int i=0;i<arr.length;i++){
4            for(int j=0;j<arr.length;j++){
5                if(i!=j && arr[i]==2*arr[j]){
6                    return true;
7                }
8            }
9        }
10        return false;
11    }
12}