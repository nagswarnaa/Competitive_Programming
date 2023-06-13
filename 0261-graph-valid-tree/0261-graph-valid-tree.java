class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1) return false;
        List<List<Integer>> adjacencyList = new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        Set<Integer> visited=new HashSet<>();
        visited.add(0);
        for(int i=0;i<n;i++){
            adjacencyList.add(new ArrayList<>());
        }
        for(int[] i:edges){
            adjacencyList.get(i[0]).add(i[1]);
            adjacencyList.get(i[1]).add(i[0]);
        }
        while(!stack.isEmpty()){
            int node=stack.pop();
            for(int x:adjacencyList.get(node)){
                if(!visited.contains(x)){
                    stack.push(x);
                visited.add(x);
                }
            }
        }
        return visited.size()==n;
    }
}