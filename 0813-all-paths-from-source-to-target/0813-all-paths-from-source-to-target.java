class Solution {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<Integer>();
        int n=graph.length-1;
        int source=0;
        traverse(graph,source,n,temp,result);
        return result;
    }
    public void traverse(int[][] graph,int source,int destination,List<Integer> temp,List<List<Integer>> result){
        temp.add(source);
        if(source==destination){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i:graph[source]){
            traverse(graph,i,destination,temp,result);
            temp.remove(temp.size()-1);
        }
    }

}