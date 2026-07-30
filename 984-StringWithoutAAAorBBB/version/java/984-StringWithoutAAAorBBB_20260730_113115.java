// Last updated: 30/07/2026, 11:31:15
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        StringBuilder sb=new StringBuilder();
4        while(a>0 || b>0){
5            int n=sb.length();
6            if(n>=2 && sb.charAt(n-1)==sb.charAt(n-2)){
7                if(sb.charAt(n-1)=='a'){
8                    sb.append('b');
9                    b--;
10                }else{
11                    sb.append('a');
12                    a--;
13                }
14            }else{
15                if(a>b && a>0){
16                    sb.append('a');
17                    a--;
18                }else{
19                    sb.append("b");
20                    b--;
21                }
22            }
23        }
24        return sb.toString();
25    }
26}