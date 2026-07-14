// Last updated: 14/07/2026, 14:14:54
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int countF=0,countT=0;
        int si=0,l;
        int max=0;
        for(int li=0;li<n;li++){
            if(answerKey.charAt(li)=='T'){
                countT++;
            }else{
                countF++;
            }
             while(Math.min(countF,countT)>k){
                if(answerKey.charAt(si)=='T'){
                    countT--;
                }else{
                    countF--;
                }
                 si++;
            }
            l=li-si+1;
            if(l>max){
                max=l;
            }
        }
        return max;
    }
}