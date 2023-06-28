class Solution {
    Map<Integer,Integer> count=new HashMap<>();
    Map<Integer,Integer> cache=new HashMap<>();
    public int deleteAndEarn(int[] nums) {
        int len=nums.length;
        int maxNum=0;
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+nums[i]);
            maxNum=Math.max(nums[i],maxNum);
        }
        return findMaxPoints(maxNum,cache);
    }
    public int findMaxPoints(int maxNum,Map<Integer,Integer> cache){
        if(maxNum==0){
            return 0;
        }
        if(maxNum==1){
            return count.getOrDefault(1,0);
        }
        if(cache.containsKey(maxNum)){
            return cache.get(maxNum);
        }
        int gain=count.getOrDefault(maxNum,0);
        cache.put(maxNum,Math.max(findMaxPoints(maxNum-1,cache),findMaxPoints(maxNum-2,cache)+gain));
        return cache.get(maxNum);
    }
}