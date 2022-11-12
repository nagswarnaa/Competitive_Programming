class Solution {
    int i=0;
    public int calculate(String s) {
        return EvaluateExpression(s);
    }
    public int EvaluateExpression(String s){
        Stack<Integer> operands=new Stack<Integer>();
        int sign=1;
        while(i<s.length()){
            char c=s.charAt(i);
            if(Character.isWhitespace(c)){
                i++;
                continue;
            }
            else if(c=='+' || c=='-'){
                sign=(c=='+'?1:-1);
                i++;
            }
            else if(Character.isDigit(c)){
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                    i++;  
                }
                operands.push((num*sign));
            }
            else if(c=='('){
                i++;
                operands.push(sign*EvaluateExpression(s));
            }
            else if(c==')'){
                i++;
                break;
            }
        }
        int num=0;
        while(!operands.isEmpty()){
          num+=(operands.pop());
        }
        return num;
    }
}