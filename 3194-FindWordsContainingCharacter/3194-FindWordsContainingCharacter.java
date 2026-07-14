// Last updated: 14/07/2026, 14:14:21
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)>=0){
                ls.add(i);
            }
        }
        return ls;
    }
}