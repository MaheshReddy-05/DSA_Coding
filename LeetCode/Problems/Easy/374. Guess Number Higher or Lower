Problem Link: https://leetcode.com/problems/guess-number-higher-or-lower/
Author: Mahesh Reddy B N
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int si = 1;
        int ei = n;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            int g = guess(mid);
            if(g==0){
                return mid;
            }
            else if(g==1){
                si = mid +1;
            }
            else{
                ei = mid-1;
            }
        }
        return si;
    }
}