class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum = 0;
        int minSum = 0;

        int maxEnding = 0;
        int minEnding = 0;

        for (int num : nums) {

            // Maximum subarray sum
            maxEnding = Math.max(0, maxEnding + num);
            maxSum = Math.max(maxSum, maxEnding);

            // Minimum subarray sum
            minEnding = Math.min(0, minEnding + num);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}