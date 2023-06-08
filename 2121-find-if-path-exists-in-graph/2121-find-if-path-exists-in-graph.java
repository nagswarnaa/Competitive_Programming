class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length==0){
            if(source==0& destination==0){
                return true;

            }
            else{
                return false;
            }
        }
        Map<Integer,List<Integer>> adjList=new HashMap<>();
        for (int i = 0; i <n; i++) {
                  adjList.put(i,new ArrayList<>());
        }
        boolean[] visited=new boolean[n];
        for(int[] x:edges){
            adjList.get(x[0]).add(x[1]);
            adjList.get(x[1]).add(x[0]);
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(source);
        visited[source]=true;
        while(stack.size()>0){
            int src=stack.pop();
            for(int i:adjList.get(src)){
                if(i==destination){
                    return true;
                }
                if(!visited[i]){
                    stack.push(i);
                    visited[i]=true;
                }
            }
        }
        return false;
    }
}