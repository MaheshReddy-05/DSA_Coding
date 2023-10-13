Problem Link: https://leetcode.com/problems/minimum-cost-for-tickets/
Author: Mahesh Reddy B N
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days.length];
        return f(days,costs,0,dp);

    }
    public int f(int[] days,int[] costs,int ci,int[] dp){
        if(ci>=days.length) return 0;
        if(dp[ci]!=0) return dp[ci];
        int first = 0;
        int second = 0;
        int third = 0;
        first = costs[0] + f(days,costs,ci+1,dp);
        second = costs[1];
        int prev = ci;
        while(ci<days.length && days[ci]<days[prev]+7){
            ci++;
        }
        second += f(days,costs,ci,dp);
        third += costs[2];
        while(ci<days.length && days[ci]<days[prev]+30){
            ci++;
        }
        third += f(days,costs,ci,dp);
        return dp[prev] = Math.min(first,Math.min(second,third));
    }
}