class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character,Integer> counts=new HashMap<>();
        for(char ch:s.toCharArray()){
            counts.put(ch,counts.getOrDefault(ch,0)+1);
        }
        if(s.length()%2==0){
            for(int i:counts.values()){
                if(i%2!=0){
                    return false;
                }
            }
        }
        else{
            boolean odd=false;
            for(int i:counts.values()){
                if(i%2!=0 && !odd){
                    odd=true;
                }
                else if(i%2!=0 && odd){
                    return false;
                }
            }
        }
        return true;
    }
}