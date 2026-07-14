// Last updated: 14/07/2026, 14:14:50
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            int count=sentences[i].split(" ").length;
            max=Math.max(max,count);
        }
        return max;
    }
}