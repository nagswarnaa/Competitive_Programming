class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        
        HashMap<Character,Integer> nums=new HashMap<Character,Integer>();
        int count=0;
        int ws=0;
        for(int we=0;we<s.length();we++){
            nums.put(s.charAt(we),nums.getOrDefault(s.charAt(we),0)+1);
            if(we-ws==k-1){
               if(nums.size()==k) count++;
                nums.put(s.charAt(ws),nums.getOrDefault(s.charAt(ws),0)-1);
                if(nums.get(s.charAt(ws))==0){
                    nums.remove(s.charAt(ws));
                }
                ws++;
            }
        }
        return count;
    }
}