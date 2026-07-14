// Last updated: 14/07/2026, 14:18:03
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                ls.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] res=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i]=ls.get(i);
        }
        return res;
    }
}