// Last updated: 14/07/2026, 14:19:08
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            res=res+arr[i];
            if(i>0){
                res=res+" ";
            }
        }
        return res;
    }
}