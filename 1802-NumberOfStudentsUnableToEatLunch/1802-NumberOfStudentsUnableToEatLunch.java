// Last updated: 14/07/2026, 14:15:14
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int c0=0,c1=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==1){
                c1++;
            }else{
                c0++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==1){
                if(c1==0){
                    return c0;
                }
                c1--;
            }else{
                if(c0==0){
                    return c1;
                }
                c0--;
            }
        }
        return 0;
    }
}