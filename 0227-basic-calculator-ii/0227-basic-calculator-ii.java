class Solution {
    public int calculate(String s) {
        String[] x=postfix(s);
        return EvaluatePostfix(x);

    }
    public String[] postfix(String s){
        HashMap<Character,Integer> priority=new HashMap<Character,Integer>();
	    priority.put('*',2);
	    priority.put('/',2);
	    priority.put('%',2);
	    priority.put('+',1);
	    priority.put('-',1);
		ArrayList<String> output=new ArrayList<String>();
		Stack<Character> operands=new Stack<Character>();
		String ops="+-%/*";
        String stt="";
		for(int i=0;i<s.length();i++){
            
		    char c=s.charAt(i);
		    if(c==' '){
		        continue;
		    }
		    if(!ops.contains(c+"")){
		        stt=stt+c;
		    }
		    else{
		        if(operands.isEmpty() || priority.get(operands.peek())<priority.get(c)){
		            operands.push(c);
                    output.add(stt);
                    stt="";
		        }
		        else {
                    output.add(stt);
                    stt="";
		            while(!operands.isEmpty() && priority.get(operands.peek()) >=priority.get(c)){
		                output.add(operands.pop()+"");
		            }                   
                    operands.push(c);
		        }
		    }
		    
		}
        output.add(stt);
		while(!operands.isEmpty()){
		         output.add(operands.pop()+"");
		}
		return Arrays.copyOf(output.toArray(), output.size(), String[].class);
    }
    public int EvaluatePostfix(String[] tokens){
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