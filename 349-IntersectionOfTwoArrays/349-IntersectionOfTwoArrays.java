// Last updated: 14/07/2026, 14:18:05
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        // Put nums1 elements in set1
        for (int n : nums1) {
            set1.add(n);
        }
        
        // Check nums2 elements in set1
        for (int n : nums2) {
            if (set1.contains(n)) {
                resultSet.add(n);  // only unique
            }
        }
        
        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int n : resultSet) {
            result[i++] = n;
        }
        
        return result;
    }
}