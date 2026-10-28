// Last updated: 28/10/2026, 09:24:53
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(g[i] <= s[j]) {
                j++;
                i++;
                ans++;
            }
            else {
                j++;
            }
        }
        return ans;
    }
}