class Solution {
    public int maxProduct(int[] nums) {

        int curMax = nums[0];
        int curMin = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
         //in positive array we directly write code but in negative containg array we have to take current min to store because in multiply -*- goes postive
            int v1 = nums[i];
            int v2 = curMax * nums[i];
            int v3 = curMin * nums[i];

            curMax = Math.max(v1, Math.max(v2, v3));
            curMin = Math.min(v1, Math.min(v2, v3));

            ans = Math.max(ans, curMax);
        }

        return ans;
    }
}