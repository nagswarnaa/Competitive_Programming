class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int len=prerequisites.length;
        int[] indegrees=new int[numCourses];
        int nodesVisited=0;
        Map<Integer,List<Integer>> adjacenyList=new HashMap<>();
        int[] order=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adjacenyList.put(i,new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            adjacenyList.get(edge[1]).add(edge[0]);
            indegrees[edge[0]]+=1;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<numCourses;i++){
            if(indegrees[i]==0){
                stack.add(i);
            }
        }
        int i=0;
        while(!stack.isEmpty()){
            int ch=stack.pop();
            order[i++]=ch;
            nodesVisited++;
            for(int x:adjacenyList.get(ch)){
                indegrees[x]-=1;
                if(indegrees[x]==0){
                    stack.add(x);
                }
            }
        }
        return nodesVisited==numCourses?order:new int[0];
    }
}