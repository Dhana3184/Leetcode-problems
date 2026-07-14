// Last updated: 14/07/2026, 14:16:00
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        String s="balon";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=map.getOrDefault(ch,0);
            if(ch=='l' || ch=='o'){
                count/=2;
            }
            min=Math.min(count,min);
        }
        return min;
    }
}