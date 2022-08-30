class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> nummap=new HashMap<Character,Integer>();
        nummap.put('I',1);
        nummap.put('V',5);
        nummap.put('X',10);
        nummap.put('L',50);
        nummap.put('C',100);
        nummap.put('D',500);
        nummap.put('M',1000);
        int sum=nummap.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(nummap.get(s.charAt(i-1))>=nummap.get(s.charAt(i))){
                sum+=nummap.get(s.charAt(i));
            }
            else{
                sum=(sum-nummap.get(s.charAt(i-1)))+(nummap.get(s.charAt(i))-nummap.get(s.charAt(i-1)));
            }
        }
        return sum;
    }
}