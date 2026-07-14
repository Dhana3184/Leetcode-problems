// Last updated: 14/07/2026, 14:16:07
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] word=text.split(" ");
        int count=0;
        for(int i=0;i<word.length;i++){
            boolean canType=true;
            for(int j=0;j<brokenLetters.length();j++){
                if(word[i].contains(String.valueOf(brokenLetters.charAt(j)))){
                    canType=false;
                    break;
                }
            }
            if(canType){
                count++;
            }
        }
        return count;
    }
}