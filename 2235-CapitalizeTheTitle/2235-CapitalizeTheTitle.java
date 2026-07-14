// Last updated: 14/07/2026, 14:14:47
class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        String[] arr=title.split(" ");
        String res="";
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(word.length()>2){
                res=res+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
            }else{
                res+=word+" ";
            }
        }
        return res.trim();
    }
}