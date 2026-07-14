// Last updated: 14/07/2026, 14:17:14
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curr=asteroids[i];
            boolean ast=false;
            while(!st.isEmpty() && curr<0 && st.peek()>0){
                if(st.peek()<-curr){
                    st.pop();
                }else if(st.peek()==-curr){
                    st.pop();
                    ast=true;
                    break;
                }else{
                    ast=true;
                    break;
                }
            }
            if(!ast){
                st.push(curr);
            }
        }
        int[] arr=new int[st.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=st.get(i);
        }
        return arr;
    }
}