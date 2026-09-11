// Last updated: 11/09/2026, 08:59:52
1class Solution {
2    public int totalNumbers(int[] digits) {
3        Set<Integer> set=new HashSet<>();
4        for(int i=0;i<digits.length;i++){
5            if(digits[i]==0){
6                continue;
7            }
8            for(int j=0;j<digits.length;j++){
9                if(j==i){
10                    continue;
11                }
12                for(int k=0;k<digits.length;k++){
13                    if(k==i || k==j){
14                        continue;
15                    }
16                    if(digits[k]%2!=0){
17                        continue;
18                    }
19                    int num=digits[i]*100 + digits[j]*10 +digits[k];
20                    set.add(num);
21                }
22            }
23        }
24        return set.size();
25    }
26}