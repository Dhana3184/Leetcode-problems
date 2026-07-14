// Last updated: 14/07/2026, 14:13:35
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            String st=words[i];
            for(int j=0;j<st.length();j++){
                char ch=st.charAt(j);
                sum+=weights[ch-'a'];
            }
            int mod=sum%26;
            char map=(char)('z'-mod);
            sb.append(map);
        }
        return sb.toString();
    }
}