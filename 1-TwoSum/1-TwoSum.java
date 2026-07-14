// Last updated: 14/07/2026, 14:20:37
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j + i < nums.length; j++) {
                if(nums[i + j] + nums[j] == target) {
                    return new int[]{j, i + j};
                }
            }
        }
        return new int[]{-1, -1};*/
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ls.add(i);
                    ls.add(j);
                    break;
                }
            }
        }
        int[] arr=new int[ls.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
}