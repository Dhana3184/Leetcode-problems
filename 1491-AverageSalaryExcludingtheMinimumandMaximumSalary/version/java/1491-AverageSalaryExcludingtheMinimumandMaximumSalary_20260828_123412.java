// Last updated: 28/08/2026, 12:34:12
1class Solution {
2    public double average(int[] salary) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<salary.length;i++){
6            min=Math.min(salary[i],min);
7            max=Math.max(salary[i],max);
8        }
9        double avg=0;
10        for(int i=0;i<salary.length;i++){
11            if(salary[i]!=min && salary[i]!=max){
12                avg+=salary[i];
13            }
14        }
15        return avg/(salary.length-2);
16    }
17}