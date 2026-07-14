// Last updated: 14/07/2026, 14:17:55
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ls=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                ls.add("FizzBuzz");
            }else if(i%3==0){
                ls.add("Fizz");
            }else if(i%5==0){
                ls.add("Buzz");
            }else{
                String s=Integer.toString(i);
                ls.add(s);
            }
        }
        return ls;
    }
}