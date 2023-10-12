// Find the sum of the array and remove the minimum sum

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSubarraySum = kadane(nums);
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i]; 
        }
        int minSubarraySum = -kadane(nums);
        if (totalSum == minSubarraySum) {
            return maxSubarraySum;
        }
        int maxCircularSubarraySum = totalSum - minSubarraySum;
        return Math.max(maxSubarraySum, maxCircularSubarraySum);
    }
    public int kadane(int[] a) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int n : a) {
            sum += n;
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }
}