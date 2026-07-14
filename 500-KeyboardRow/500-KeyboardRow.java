// Last updated: 14/07/2026, 14:17:40
class Solution {
    public String[] findWords(String[] words) {
        int[] row=new int[26];
        for(char ch:"qwertyuiop".toCharArray()){
            row[ch-'a']=1;
        }
        for(char ch:"asdfghjkl".toCharArray()){
            row[ch-'a']=2;
        }
        for(char ch:"zxcvbnm".toCharArray()){
            row[ch-'a']=3;
        }
        List<String> ls=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            int r=row[word.charAt(0)-'a'];
            boolean found=true;
            for(int j=1;j<word.length();j++){
                if(row[word.charAt(j)-'a']!=r){
                    found=false;
                    break;
                }
            }
            if(found){
                ls.add(words[i]);
            }
        }
        String[] arr=new String[ls.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
}