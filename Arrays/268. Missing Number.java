class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int k = (nums.length*(nums.length+1))/2;
        for(int i:nums){
            sum+=i;
        }
        return k-sum;
    }
}