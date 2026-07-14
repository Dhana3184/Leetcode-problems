// Last updated: 14/07/2026, 14:17:00
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char let=letters[0];
        Arrays.sort(letters);
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return let;
    }
}