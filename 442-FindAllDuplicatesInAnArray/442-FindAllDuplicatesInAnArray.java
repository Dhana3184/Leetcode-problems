// Last updated: 14/07/2026, 14:17:51
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Place nums[i] at its correct index (nums[i] - 1) until it's in place
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Now, duplicates will be at wrong positions
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                duplicates.add(nums[i]);
            }
        }

        return duplicates;
    
    }
}