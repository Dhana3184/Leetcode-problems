// Last updated: 14/07/2026, 14:17:36
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            ans.append(sb.reverse());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}