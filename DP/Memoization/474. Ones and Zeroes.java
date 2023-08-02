// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/ones-and-zeroes/

class Pair{
    int one;
    int zer;
    Pair(int zer,int one){
        this.one = one;
        this.zer = zer;
    }
}
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int [][][]dp = new int[m+1][n+1][strs.length+1];
        return helper(strs,m,n,0,dp);
    }
    public int helper(String[] str,int m,int n,int si,int[][][] dp){
        if(si>=str.length) return 0;
        if(dp[m][n][si]!=0) return dp[m][n][si];
        Pair curr = count(str[si]);
        int take = 0;
        int ntake = 0;
        if(m-curr.zer>=0 && n-curr.one>=0){
            take = 1;
            take += helper(str,m-curr.zer,n-curr.one,si+1,dp);
        }
        ntake += helper(str,m,n,si+1,dp);
        return dp[m][n][si] = Math.max(take,ntake);
    }
    public Pair count(String s){
        int one = 0;
        int zer = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='0'){
                zer++;
            }
            if(c=='1'){
                one++;
            }
        }
        Pair p = new Pair(zer,one);
        return p;
    }
}