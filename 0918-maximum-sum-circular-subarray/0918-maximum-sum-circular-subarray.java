class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int curMax = 0;
        int maxSum = nums[0];

        int curMin = 0;
        int minSum = nums[0];

        for (int num : nums) {

            // Maximum subarray (Kadane)
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);

            // Minimum subarray
            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);

            total += num;
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Circular case
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}