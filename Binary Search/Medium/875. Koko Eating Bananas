Problem Link: https://leetcode.com/problems/koko-eating-bananas/
Author: Mahesh Reddy B N
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long sv = 1;
        long ev = piles[0];
        for(int i:piles){
            ev = Math.max(ev,i);
        }
        while(sv<=ev){
            long mid = sv+(ev-sv)/2;
            if(canEat(piles,h,mid)) ev = mid-1;
            else sv = mid+1;
        }
        return (int)sv;
    }
    public boolean canEat(int[]piles,long h,long k){
        long ans = 0;
        for(int i=0;i<piles.length;i++){
            ans+=piles[i]/k;
            if(piles[i]%k!=0){
                ans++;
            }
        }
        return ans <= h;
    }
}