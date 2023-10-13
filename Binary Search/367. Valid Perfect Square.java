Problem Link: https://leetcode.com/problems/valid-perfect-square/
Author: Mahesh Reddy B N
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        long si = 1;
        long ei = num/2;
        while(si<=ei){
            long mid = (si+ei)/2;
            long sq = mid*mid;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                si = mid+1;
            }
            else{
                ei = mid -1;
            }
        }
        return false;
    }
}