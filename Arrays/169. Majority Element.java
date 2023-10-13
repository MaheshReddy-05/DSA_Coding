// Author: Mahesh Reddy BN
// Problem Link: https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int count = 0;
        for(int i:nums){
            if(count==0) ele = i;
            count+= (ele==i) ? 1: -1;
        }
        return ele;
    }
}