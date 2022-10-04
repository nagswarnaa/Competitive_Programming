class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(result.containsKey(complement)){
                return new int[]{i,result.get(complement)};
            }
            result.put(nums[i],i);
        }
            return null;
    }
}