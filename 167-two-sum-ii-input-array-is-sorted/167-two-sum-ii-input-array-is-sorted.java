class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0,e=numbers.length-1;
        int[] result=new int[2];
        while(s<e){
            int sum=numbers[s]+numbers[e];
            if(sum==target){
                result[0]=s+1;
                result[1]=e+1;
                break;
            }
            else if(sum>target){
                e--;
            }
            else{
                s++;
            }        
        }
        return result;
    }
}