Problem Link: https://leetcode.com/problems/jump-game/description/
class Solution {
    public boolean canJump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public boolean helper(int[] arr,int k,int []dp){
        if(k>=arr.length-1) return true;
        if(arr[k]==0) return false;
        if(dp[k]!=-1){
            if(dp[k]==1) return true;
            else return false;
        }
        boolean ans = false;
        for(int i=arr[k];i>=1;i--){
            if(helper(arr,k+i,dp)){
                dp[k] = 1;
                return true;
            }
        }
        dp[k] = 0;
        return ans;
    }
}