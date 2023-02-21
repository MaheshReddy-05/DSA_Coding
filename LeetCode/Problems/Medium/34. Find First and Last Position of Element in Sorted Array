Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Author: Mahesh Reddy B N
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int al = nums.length;
        int si = 0;
        int ei = al - 1;
        int ans[] = {-1,-1};
        int anss[] = {-1,2};
        int mid = 0;
        while(si<=ei){
            mid = si+(ei-si)/2;
            if(nums[mid]==target){
                ans[0] = mid;
                ans[1] = mid;
                break;
            }
            else if (nums[mid]>target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        if(ans[0]==-1 && ans[1]==-1) return ans;
        getLowest(nums,ans,si,mid-1,target);
        getHighest(nums,ans,mid+1,ei,target);
        return ans;
    }
    public void getLowest(int []nums,int[]anss,int si,int ei,int target){
        int mid = 0;
        while(si<=ei){
            mid = si+(ei-si)/2;
            if(nums[mid]==target){
                anss[0] = Math.min(anss[0],mid);
                ei = mid-1;
            }
            else if (nums[mid]>target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
    }
    public void getHighest(int[]nums,int []anss,int si,int ei,int target){
        int mid = 0;
        while(si<=ei){
            mid = si+(ei-si)/2;
            if(nums[mid]==target){
                anss[1] = Math.max(anss[1],mid);
                si = mid+1;
            }
            else if (nums[mid]>target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
    }
}