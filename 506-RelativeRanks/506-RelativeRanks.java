// Last updated: 14/07/2026, 14:17:39
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=1;
        while(!pq.isEmpty()){
            map.put(pq.poll(),n++);
        }
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++){
            int curr=map.get(score[i]);
            if(curr==1){
                res[i]="Gold Medal";
            }else if(curr==2){
                res[i]="Silver Medal";
            }else if(curr==3){
                res[i]="Bronze Medal";
            }else{
                res[i]=Integer.toString(curr);
            }
        }
        return res;
    }
}