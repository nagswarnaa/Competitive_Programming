import java.util.*;

class Solution {
    Set<Integer> mem;
    Set<String> wordDictSet;

    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        mem = new HashSet<Integer>();
        wordDictSet = new HashSet<String>(wordDict);
        return findWord(len, s);
    }

    public boolean findWord(int start, String s){
        if(start <= 0){
            return true;
        }
        if(mem.contains(start)){
            return false;
        }
        for(String x : wordDictSet){
            int lenSub = x.length();
            if(start - lenSub >= 0 && x.equals(s.substring(start - lenSub, start)) && findWord(start - lenSub, s)){
                return true;
            } 
        }
        mem.add(start);
        return false;
    }
}
