// Last updated: 22/08/2026, 12:06:27
1class Solution {
2    public String mostCommonWord(String paragraph, String[] banned) {
3        paragraph=paragraph.toLowerCase();
4        String[] arr = paragraph.split("[^a-z]+");
5        HashMap<String,Integer> map=new HashMap<>();
6        for(int i=0;i<arr.length;i++){
7            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
8        }
9        int max=0;
10        String res="";
11        for(int i=0;i<arr.length;i++){
12            boolean isbanned=false;
13            for(int j=0;j<banned.length;j++){
14                if(arr[i].equals(banned[j].toLowerCase())){
15                    isbanned=true;
16                    break;
17                }
18            }
19            if(!isbanned){
20                if(map.get(arr[i])>max){
21                    max=map.get(arr[i]);
22                    res=arr[i];
23                }
24            }
25        }
26        return res;
27    }
28}