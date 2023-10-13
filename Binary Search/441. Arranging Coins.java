Problem Link: https://leetcode.com/problems/arranging-coins/
Author: Mahesh Reddy B N
class Solution {
    public int arrangeCoins(int n) {
        long si = 1;
        long ei = n;
        long ans = 0;
        while(si<=ei){
            long mid = si + (ei-si)/2;
            if(check(mid,n)) {
                si = mid+1;
                ans = Math.max(ans,mid);
            }
            else ei = mid-1;
        }
        return (int)ans;
    }
    public boolean check(long n,long total){
        if(n*(n+1)/2 <= total){
            return true;
        }
        return false;
    }
}