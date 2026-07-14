// Last updated: 14/07/2026, 14:15:41
class Solution {
    public boolean isVowel(char c){
        return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u';
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for(int i=1;i<n-k+1;i++){
            if(isVowel(s.charAt(i-1))){
                count--;
            }
            if(isVowel(s.charAt(i+k-1))){
                count++;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}
