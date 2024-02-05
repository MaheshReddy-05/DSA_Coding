// Problem Link: https://leetcode.com/problems/maximum-product-subarray/description/
// Author: Mahesh Reddy B N

class Solution {
    public int maxProduct(int[] nums) {
        int prefixSum =1;
        int sufixSum =1;
        int ans =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
          prefixSum = prefixSum*nums[i];
          sufixSum = sufixSum*nums[nums.length-1-i];
          ans = Math.max(ans,Math.max(prefixSum,sufixSum));
          if(prefixSum==0) prefixSum = 1;
          if(sufixSum==0) sufixSum = 1;
        }
        return ans;
    }
}