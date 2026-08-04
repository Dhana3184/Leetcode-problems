// Last updated: 04/08/2026, 12:27:00
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        int ones = 0;
4        int flips = 0;
5        for (char c : s.toCharArray()) {
6            if (c == '1') {
7                ones++;
8            } else {
9                flips = Math.min(flips + 1, ones);
10            }
11        }
12        return flips;
13    }
14}