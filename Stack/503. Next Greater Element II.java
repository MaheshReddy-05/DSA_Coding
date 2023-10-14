class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length; 
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>(); // create a stack using ArrayDeque since its efficient
        
        // loop through the array twice, because we need to compare each element with every other element
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n]; // get the current element by taking modulus with n
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                // while stack is not empty and top element of stack is less than current element
                res[stack.pop()] = num; // update result array with current element for top element of stack
            }
            if (i < n) {
                stack.push(i); // push the current index onto the stack if i < n
            }
        }
        return res; // return the result array
    }
}