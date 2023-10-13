class Solution {
    public int numSquares(int n){
        int dp[]=new int[n+1];
        return helper(n,dp);
    }
    
    public int helper(int n,int dp[]){
        if(n<0) return Integer.MAX_VALUE; 
        if(n==0) return 0;
        
        if(dp[n]>0) return dp[n];
        
        // min = n cuz at max if we take all 1's that will be the ans 
        int min=n; 

        // Trying all ps ways 
        for(int i=1;i*i<=n;i++){
            min=Math.min(min,helper(n-(i*i),dp));
        }
        dp[n]=min+1;
        return min+1;
    }
}