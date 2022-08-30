class Solution {
    public String intToRoman(int num) {
      int[] nums=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String[] romans=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
      String str="";
      int i=0;  
      while(num!=0){
          if(num>=nums[i]){
              str+=romans[i];
              num=num-nums[i];
          }
          else{
              i++;
          }
      }
      return str;  
      
    }
}