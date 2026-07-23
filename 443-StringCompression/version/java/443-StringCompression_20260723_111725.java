// Last updated: 23/07/2026, 11:17:25
1class Solution {
2    public int compress(char[] chars) {
3        int read=0;
4        int write=0;
5        while(read<chars.length){
6            int count=0;
7            char curr=chars[read];
8            while(read<chars.length && chars[read]==curr){
9                count++;
10                read++;
11            }
12            chars[write]=curr;
13            write++;
14            if(count>1){
15                String str=String.valueOf(count);
16                for(char ch:str.toCharArray()){
17                    chars[write]=ch;
18                    write++;
19                }
20            }
21        }
22        return write;
23    }
24}