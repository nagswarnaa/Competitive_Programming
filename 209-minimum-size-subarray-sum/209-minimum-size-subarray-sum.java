class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,s=0,e=0,minsum=Integer.MAX_VALUE;
        for(e=0;e<nums.length;e++){
            sum+=nums[e];
            while(sum>=target){
                minsum=Math.min(minsum,e-s+1);
                sum-=nums[s];
                s++;
            }
        }
        return minsum==Integer.MAX_VALUE?0:minsum;
    }
}  