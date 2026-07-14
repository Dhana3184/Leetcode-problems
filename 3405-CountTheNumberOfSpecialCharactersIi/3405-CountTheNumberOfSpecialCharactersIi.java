// Last updated: 14/07/2026, 14:14:11
class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> lowerLast=new HashMap<>();
        HashMap<Character,Integer> upperFirst=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lowerLast.put(ch,i);
            }else{
                upperFirst.putIfAbsent(ch,i);
            }
        }
        int count=0;
        for(char ch='a';ch<='z';ch++){
            char upper=Character.toUpperCase(ch);
            if(lowerLast.containsKey(ch) && upperFirst.containsKey(upper)){
                int low_ind=lowerLast.get(ch);
                int upp_ind=upperFirst.get(upper);
                if(low_ind<upp_ind){
                    count++;
                }
            }
        }
        return count;
    }
}