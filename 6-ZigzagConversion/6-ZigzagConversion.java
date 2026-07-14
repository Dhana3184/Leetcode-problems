// Last updated: 14/07/2026, 14:20:31
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<rows.length;i++){
            rows[i]=new StringBuilder();
        }
        int row=0;
        boolean down=true;
        for(char ch:s.toCharArray()){
            rows[row].append(ch);
            if(row==0){
                down=true;
            }else if(row==numRows-1){
                down=false;
            }
            if(down){
                row++;
            }else{
                row--;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<rows.length;i++){
            sb.append(rows[i]);
        }
        return sb.toString();
    }
}