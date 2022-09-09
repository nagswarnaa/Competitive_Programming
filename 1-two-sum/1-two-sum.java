class Solution {
    public int[] twoSum(int[] nums, int target) {
      List<Integer> numsList = new ArrayList<Integer>();
      for(int i=0;i<nums.length;i++){
          numsList.add(nums[i]);
      }  

      for(int i=0;i<nums.length;i++){
          int num2=target-nums[i];
          if(numsList.contains(num2)){
              if(i!=numsList.indexOf(num2)){
                  return new int[]{i,numsList.indexOf(num2)};
              }
              
          }
      }
       return new int[]{0,0}; 
    }
}