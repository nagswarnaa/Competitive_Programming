class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        int len=nums.length;
        result=new ArrayList<>();
        boolean[] visited=new boolean[len];
        List<Integer> temp=new ArrayList<>();
        findPermutation(temp,len,nums,visited);
        return result;
    }
    public void findPermutation(List<Integer> temp,int len,int[] nums,boolean[] visited){
        if(temp.size()==len){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<len;i++){
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i]=true;
                findPermutation(temp,len,nums,visited);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }
    }
}