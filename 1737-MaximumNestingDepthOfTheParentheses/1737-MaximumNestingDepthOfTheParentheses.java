// Last updated: 14/07/2026, 14:15:23
class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                current++;
            }else if(ch==')'){
                current--;
            }
            max=Math.max(max,current);
        }
        return max;
    }
}