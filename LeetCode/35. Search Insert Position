Problem Link: https://leetcode.com/problems/search-insert-position/
Author: Mahesh Reddy B N
class Solution {
    public int searchInsert(int[] arr, int target) {
        int si = 0;
        int ei = arr.length-1;
        int mid = 0;
        while(si<=ei){
            mid = (si+ei)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) si= mid+1;
            else ei = mid-1;
        }
        return si;
    }
}