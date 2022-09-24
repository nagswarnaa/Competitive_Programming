class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0,end=nums.length-1;
        int[] ret=new int[nums.length];
        int k=nums.length-1;
        while(start<=end){
            int a=Math.abs(nums[start]);
            int b=Math.abs(nums[end]);
            if(a<b){
                ret[k--]=b*b;
                end--;
            }
            else{
                ret[k--]=a*a;
                start++;
            }
        }
        return ret;
    }
}