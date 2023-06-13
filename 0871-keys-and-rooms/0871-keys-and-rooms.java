class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len=rooms.size();
        boolean[] visited=new boolean[len];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        while(stack.size()>0){
                int x=stack.pop();
                visited[x]=true;
                for(int i:rooms.get(x)){
                    if(!visited[i]){
                         stack.push(i);
                    }
                }
            }
        for(boolean j:visited){
            if(!j){
                return false;
            }
        }
        return true;
    }
}