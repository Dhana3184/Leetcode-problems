// Last updated: 14/07/2026, 14:14:03
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int count=0;
        for(int i=0;i<colors.length;i++){
            int prev=(i-1+n)%n;
            int next=(i+1)%n;
            if(colors[i]!=colors[prev] && colors[i]!=colors[next]){
                count++;
            }
        }
        return count;
    }
}