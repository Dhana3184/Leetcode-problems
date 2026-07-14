// Last updated: 14/07/2026, 14:18:20
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                ls.add(entry.getKey());
            }
        }
        int[] arr=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
}