class Solution {
    int xorSum=0;
    public void findXorSum(List<Integer> temp){
        int sum=0;
        for(int i:temp){
            sum=(i^sum);
        }
        xorSum+=sum;
    }
    public int subsetXORSum(int[] nums) {
        int len=nums.length;
        findSubsets(len,new LinkedList<Integer>(),nums,0);
        return xorSum;
    }
    public void findSubsets(int len,LinkedList<Integer> temp,int[] nums,int idx){
        findXorSum(temp);
        for(int i=idx;i<len;i++){
            temp.add(nums[i]);
            findSubsets(len,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}