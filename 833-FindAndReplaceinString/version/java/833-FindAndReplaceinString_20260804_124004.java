// Last updated: 04/08/2026, 12:40:04
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int n = s.length();
4        int[] match = new int[n];
5        java.util.Arrays.fill(match, -1);
6        for (int i = 0; i < indices.length; i++) {
7            int idx = indices[i];
8            if (s.startsWith(sources[i], idx)) {
9                match[idx] = i;
10            }
11        }
12        StringBuilder ans = new StringBuilder();
13        for (int i = 0; i < n;) {
14            if (match[i] != -1) {
15                int k = match[i];
16                ans.append(targets[k]);
17                i += sources[k].length();
18            } else {
19                ans.append(s.charAt(i));
20                i++;
21            }
22        }
23        return ans.toString();
24    }
25}