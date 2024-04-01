class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int curRow=0;
        int diff=1;
        for(char ch: s.toCharArray()){
            rows[curRow].append(ch);
            if(curRow==numRows-1){
                diff=-1;
            }
            if(curRow==0){
                diff=1;
            }
            curRow+=diff;
         }
         for(int i=0;i<numRows;i++){
             res.append(rows[i]);
         }
         return res.toString();
    }
}