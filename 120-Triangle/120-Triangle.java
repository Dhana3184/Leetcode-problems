// Last updated: 14/07/2026, 14:19:29
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for (int i = n - 2; i >= 0; i--) {
            List<Integer> currentRow = triangle.get(i);
            List<Integer> belowRow = triangle.get(i + 1);
            
            for (int j = 0; j < currentRow.size(); j++) {
                int sum = currentRow.get(j) + Math.min(belowRow.get(j), belowRow.get(j + 1));
                currentRow.set(j, sum);
            }
        }
        return triangle.get(0).get(0);
    }
}