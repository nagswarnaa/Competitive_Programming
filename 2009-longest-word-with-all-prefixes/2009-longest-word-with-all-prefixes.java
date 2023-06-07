class TrieNode{
    private  TrieNode[] nodes;
    private boolean isTerminal;
    private final int count=26;
    public TrieNode(){
        nodes =new TrieNode[count];
        isTerminal=false;
    }
    public void setNode(char ch,TrieNode node){
            nodes[ch-'a']=node;
    }
    public TrieNode getNode(char ch){
            return nodes[ch-'a'];
    }
    public boolean checkNode(int ch){
            return nodes[ch]!=null;
    }
    public boolean checkNode(char ch){
        return nodes[ch-'a']!=null;
    }
    public void setTermainal(){
        isTerminal=true;
    }
    public boolean getTerminal(){
        return isTerminal;
    }
    public int getCount(){
        return count;
    }
}
class Solution {
    private TrieNode root;
    public Solution(){
        root=new TrieNode();
    }
    public void addWord(String word){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!node.checkNode(ch)){
                node.setNode(ch,new TrieNode());
            }
            node=node.getNode(ch);
        }
        node.setTermainal();
    }
    
    public boolean checkString(String word){
            TrieNode node=root;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(!node.checkNode(ch)){
                        return false;
                }
                node=node.getNode(ch);
                if(!node.getTerminal()){
                    return false;
                }
            }
            return node.getTerminal();
    }
    public String longestWord(String[] words) {
            for(String i:words){
                addWord(i);
            }
            String result="";
            for(String i:words){
                if(checkString(i)){
                    if (i.length() > result.length() || (i.length() == result.length() && i.compareTo(result) < 0)) {
                result = i;
            }
                }
            }
            return result;

    }
}