// Last updated: 01/09/2026, 11:38:29
1class Solution {
2    public int uniqueMorseRepresentations(String[] words) {
3        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
4        HashSet<String> set=new HashSet<>();
5        for(int i=0;i<words.length;i++){
6            String word=words[i];
7            StringBuilder sb=new StringBuilder();
8            for(char c:word.toCharArray()){
9                sb.append(morse[c-'a']);
10            }
11            set.add(sb.toString());
12        }
13        return set.size();
14    }
15}