class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(String i:word1){
            str1.append(i);
        }
        for(String i:word2){
            str2.append(i);
        }
        return str1.toString().equals(str2.toString());

    }
}