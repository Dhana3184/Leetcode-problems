// Last updated: 21/08/2026, 14:07:27
1class Solution {
2    public String convertToBase7(int num) {
3        if(num==0){
4            return "0";
5        }
6        boolean negative=num<0;
7        num=Math.abs(num);
8        StringBuilder sb=new StringBuilder();
9        while(num>0){
10            sb.append(num%7);
11            num/=7;
12        }
13        if(negative){
14            sb.append("-");
15        }
16        return sb.reverse().toString();
17    }
18}