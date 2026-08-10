// Last updated: 10/08/2026, 12:21:01
1class Solution {
2    public String addStrings(String num1, String num2) {
3        int i=num1.length()-1;
4        int j=num2.length()-1;
5        StringBuilder res=new StringBuilder();
6        int carry=0;
7        while(i>=0 || j>=0 || carry>0){
8            int d1=0;
9            int d2=0;
10            if(i>=0){
11                d1=num1.charAt(i)-'0';
12                i--;
13            }
14            if(j>=0){
15                d2=num2.charAt(j)-'0';
16                j--;
17            }
18            int sum=d1+d2+carry;
19            int digit=sum%10;
20            carry=sum/10;
21            res.append((char)(digit+'0'));
22        }
23        return res.reverse().toString();
24    }
25}