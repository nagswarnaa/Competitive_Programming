class Solution {
    
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int[] tabulation=new int[n+1];
        tabulation[0]=0;
        tabulation[1]=1;
        for(int i=2;i<=n;i++){
            tabulation[i]=tabulation[i-1]+tabulation[i-2];
        }
        return tabulation[n];
    }
}