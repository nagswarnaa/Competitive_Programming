class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
       List<Integer> n=new ArrayList<Integer>();
        for(int i:nums){
            n.add(i);
        }
        for(int i:nums){
            if(n.contains(i+diff)&& n.contains(i+(2*diff)))
               count++;
               }
          return count;     
    }
}