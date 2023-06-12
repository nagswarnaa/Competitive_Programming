class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len=nums.length;
        result=new ArrayList<>();
        boolean[] visited=new boolean[len];
        List<Integer> temp=new ArrayList<>();
        findPermutaions(temp,len,visited,nums);
        return result;
    }
    public void findPermutaions(List<Integer> temp,int len,boolean[] visited,int[] nums){
        if(temp.size()==len && !result.contains(temp)){
                result.add(new ArrayList<>(temp));
        }
        for(int i=0;i<len;i++){
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i]=true;
                findPermutaions(temp,len,visited,nums);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }
    }
}