class Solution {
    int s=Integer.MAX_VALUE,e=Integer.MIN_VALUE;
    public int[] searchRange(int[] nums, int target) {
       Bnfind(nums,0,nums.length-1,target);
       if(s==Integer.MAX_VALUE){
           return new int[]{-1,-1}; 
       } 
       return new int[]{s,e}; 
    }
    public void Bnfind(int[] nums,int start,int end, int target){
        if(start>end ){
            return;
        }
        int mid=(start+end)/2;
        if(target==nums[mid]){
            if(s>mid){
                s=mid;
                Bnfind(nums,start,mid-1,target);
            }
            if(e<mid){
                e=mid;
                Bnfind(nums,mid+1,end,target);
            }
        }
        else if(target<nums[mid]){
            Bnfind(nums,start,mid-1,target);
        }
        else{
            Bnfind(nums,mid+1,end,target);
        }
    }
}