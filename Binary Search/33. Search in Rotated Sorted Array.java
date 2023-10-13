Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
Author: Mahesh Reddy B N
class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        int al = nums.length;
        if(al==1 && nums[0]!= target) return ans;
        int si = 0;
        int ei = al-1;
        if(target>=nums[0]){
            ans = upperSearch(nums,al,si,ei,target);
        }
        else{
            ans = lowerSearch(nums,al,si,ei,target);
        }
        return ans;
    }
    public int upperSearch(int arr[],int al,int si,int ei,int target){
        int mid = 0;
        while(si<=ei){
            mid = si+(ei-si)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>=arr[0]){
                if(arr[mid]>target){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public int lowerSearch(int arr[],int al,int si,int ei,int target){
        int mid = 0;
        while(si<=ei){
            mid = si+(ei-si)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<arr[0]){
                if(arr[mid]>target){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{
                si = mid+1;
            }
        }
        return -1;
    }
}