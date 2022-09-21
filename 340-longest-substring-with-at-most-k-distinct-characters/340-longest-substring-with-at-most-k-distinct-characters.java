class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character,Integer> nums=new HashMap<Character,Integer>();
        int maxlength=0;
        int ws=0,we=0;
        for(;we<s.length();we++){
            nums.put(s.charAt(we),nums.getOrDefault(s.charAt(we),0)+1);
            if(nums.size()<=k){
                           maxlength=maxlength<(we-ws+1)?we-ws+1:maxlength; 
            }
            while(nums.size()>k){
                nums.put(s.charAt(ws),nums.getOrDefault(s.charAt(ws),0)-1);
                if(nums.get(s.charAt(ws))==0){
                    nums.remove(s.charAt(ws));
                }
                ws++;
            }
        }
        return maxlength;
    }
}