// Last updated: 14/07/2026, 14:13:49
class Solution {
    public int specialTriplets(int[] nums) {
        long MOD = 1_000_000_007;

        Map<Integer, Long> right = new HashMap<>();
        Map<Integer, Long> left = new HashMap<>();

        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0L) + 1);
        }

        long ans = 0;

        for (int j = 0; j < nums.length; j++) {
            int mid = nums[j];
            right.put(mid, right.get(mid) - 1);  // moving j from right to left

            long needed = mid * 2L;

            long countLeft = left.getOrDefault((int)needed, 0L);
            long countRight = right.getOrDefault((int)needed, 0L);

            ans = (ans + (countLeft * countRight) % MOD) % MOD;

            left.put(mid, left.getOrDefault(mid, 0L) + 1);
        }

        return (int)ans;
    }
}