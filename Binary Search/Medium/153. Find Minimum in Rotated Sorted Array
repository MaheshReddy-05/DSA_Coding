Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
Author: Mahesh Reddy B N
class Solution {
    public int findMin(int[] nums) {
        int al = nums.length;
        if(al==1 || (nums[0] < nums[al-1])) return nums[0];
        int si = 0;
        int ei = al-1;
        int mid = 0;
        int ans = Integer.MAX_VALUE;
        while(si<=ei){
            mid = si+(ei-si)/2;
            ans = Math.min(nums[mid],ans);
            if(nums[mid]>=nums[0]) si= mid+1;
            else ei = mid-1;
        }
        return ans;
    }
}