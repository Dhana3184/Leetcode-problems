// Last updated: 28/10/2026, 09:08:56
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        List<Integer> ls=new ArrayList<>(map.keySet());
8        ls.sort((a,b)-> map.get(b)-map.get(a));
9        int[] arr=new int[k];
10        for(int i=0;i<k;i++){
11            arr[i]=ls.get(i);
12        }
13        return arr;
14    }
15}