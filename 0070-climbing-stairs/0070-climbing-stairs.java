class Solution {
    public int climbStairs(int n) {
        int[] memoization=new int[n+1];
        memoization[0]=1;
        memoization[1]=1;
        for(int i=2;i<=n;i++){
            memoization[i]=memoization[i-1]+memoization[i-2];
        }
        return memoization[n];
    }
}