class Solution {

    public int lengthOfLongestSubstring(String s) {
          HashMap<Character,Integer> nums=new HashMap<Character,Integer>();
          int maxlen=0,ws=0;
        for(int we=0;we<s.length();we++){
            nums.put(s.charAt(we),nums.getOrDefault(s.charAt(we),0)+1);
            if(we-ws+1==nums.size()) maxlen=Math.max(maxlen,we-ws+1);
            while(nums.size()<we-ws+1){
            nums.put(s.charAt(ws),nums.getOrDefault(s.charAt(ws),0)-1);
                if(nums.get(s.charAt(ws))==0){
                    nums.remove(s.charAt(ws));
                }
                ws++;
            }
        }
        return maxlen;
    }
}