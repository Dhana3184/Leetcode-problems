// Last updated: 14/07/2026, 14:18:47
class Solution {
    public int countPrimes(int n) {
        int count=0;
        if(n==0 || n==1){
            return 0;
        }
        boolean[] isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;  
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}