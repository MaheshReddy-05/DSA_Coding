Problem Link: https://leetcode.com/problems/jump-game-ii/description/
class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public int helper(int[] arr,int k,int[]dp){
        if(k>=arr.length-1) return 0;
        if(arr[k]==0) return Integer.MAX_VALUE;
        if(dp[k]!=-1){
            return dp[k];
        }
        int ans = Integer.MAX_VALUE-1;
        for(int i=1;i<=arr[k];i++){
            ans = Math.min(ans,helper(arr,k+i,dp));
        }
        return dp[k] = 1+ans;
    }
}