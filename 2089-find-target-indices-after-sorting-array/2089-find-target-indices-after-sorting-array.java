class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0,greater=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<target){
                less++;
            }
            if(nums[i]>target){
                greater++;
            }
        }
        int count=len-(less+greater);
        List<Integer> ret=new ArrayList<Integer>();
        for(int i=0;i<count;i++){
            ret.add(less++);
        }
        return ret;
    }
}