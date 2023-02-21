Problem Link: https://leetcode.com/problems/binary-search/
Author: Mahesh Reddy B N
class Solution {
    public int search(int[] arr, int target) {
        int si = 0;
        int ei = arr.length-1;
        int mid = 0;
        while(si<=ei){
            mid =  (si+ei)/2;
            if(arr[mid]<target){
                si = mid+1;
            }
            else if(arr[mid]>target){
                ei=mid;
            }
            else if(arr[mid] == target){
                return mid;
            }
        }
        return mid;
    }
}