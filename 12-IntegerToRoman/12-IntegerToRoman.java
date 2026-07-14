// Last updated: 14/07/2026, 14:20:23
class Solution {
    public String intToRoman(int num) {
        String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                sb.append(romans[i]);
                num=num-values[i];
            }
        }
        return sb.toString();
    }
}