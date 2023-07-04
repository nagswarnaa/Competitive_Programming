class Solution {
    Integer[][] dp;
    public int minDistance(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        dp=new Integer[len1][len2];
        return findMin(0,0,len1,len2,word1,word2);
    }
    public int findMin(int i,int j,int len1,int len2,String word1, String word2){
        if(i==len1) return len2-j;
        if(j==len2) return len1-i;
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)) {
            dp[i][j]=findMin(i+1,j+1,len1,len2,word1,word2);
            return dp[i][j];
        }
        int ins=findMin(i,j+1,len1,len2,word1,word2);
        int del=findMin(i+1,j,len1,len2,word1,word2);
        int rep=findMin(i+1,j+1,len1,len2,word1,word2);
        dp[i][j]= Math.min(ins,Math.min(del,rep))+1;
        return dp[i][j];
    }
}