// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/find-the-duplicate-number/description/

class Solution {
    public int findDuplicate(int[] nums) {
        boolean check = true;
        int si = 0;
        while(check){
            int temp = nums[si];
            if(temp==-1) return si;
            nums[si] = -1;
            si = temp;
        }
        return si;
    }
}