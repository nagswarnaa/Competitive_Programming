class Solution {
    Set<Integer> mem;
    Set<String> wordDictSet;
    public boolean wordBreak(String s, List<String> wordDict) {
        int len=s.length();
        mem=new HashSet<Integer>();
        wordDictSet=new HashSet<String>(wordDict);
        return findWord(len,s,wordDictSet);
    }
    public boolean findWord(int start,String s, Set<String> wordDictSet){
        if(start<=0){
            return true;
        }
        if(mem.contains(start)){
            return false;
        }
        for(String x:wordDictSet){
               int lenSub=x.length();
               if(start-lenSub>=0 && x.equals(s.substring(start-lenSub,start)) && findWord(start-lenSub,s,wordDictSet)){
                  
                  return true;
               } 
        }
        mem.add(start); 
        return false;
    }
    public boolean compare(int start,int len, String source,String sub){
        if(start-len<0){
            return false;
        }
        return sub.equals(source.substring(start-len,start));
    }
}