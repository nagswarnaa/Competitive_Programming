class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String i:tokens){
             if((i.equals("+")) || (i.equals("-"))|| (i.equals("*"))|| (i.equals("/"))){
                 int y=stack.pop();
                 int x=stack.pop();
                 if(i.equals("+")){
                     stack.push(x+y);
                 }
                 else if(i.equals("-")){
                     stack.push(x-y);
                 }
                 else if(i.equals("*")){
                     stack.push(x*y);
                 }
                 else if(i.equals("/")){
                     stack.push(x/y);
                 }
             }
            else{
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}