// Last updated: 26/10/2026, 09:21:51
1class Solution {
2    public String toHex(int num) {
3        if(num==0){
4            return "0";
5        }
6        String hex="";
7        char[] dig={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
8        while(num!=0){
9            int rem=num&15;
10            hex=dig[rem]+hex;
11            num>>>=4;
12        }
13        return hex;
14    }
15}