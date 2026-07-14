// Last updated: 14/07/2026, 14:19:23
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLen=0;
        for(int num:set){
            int len=0;
            if(!set.contains(num-1)){
                int current=num;
                len=1;
                while(set.contains(current+1)){
                    current++;
                    len++;
                }
            }
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}