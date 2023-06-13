class Solution {
    List<String> result=new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        int len=s.length();
        findAll(s,len,0,new StringBuilder());
        return result;
    }
    public void findAll(String s,int len,int idx,StringBuilder str){
        if(str.length()==len){
            result.add(str.toString());
            return;
        }
        for(int i=idx;i<len;i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                findAll(s,len,i+1,new StringBuilder(str.toString()).append(Character.toLowerCase(ch)));
            }
            else if(ch>='a' && ch<='z'){
                findAll(s,len,i+1,new StringBuilder(str.toString()).append(Character.toUpperCase(ch)));
            }
            findAll(s,len,i+1,str.append(ch));
        }
    }
}