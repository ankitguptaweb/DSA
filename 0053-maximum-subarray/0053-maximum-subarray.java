
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int current= nums[0];
        for(int i =1;i<nums.length ;i++){
            current = Math.max(nums[i], current+nums[i]);
            sum=Math.max(sum,current);
           
        }
         return sum;
    }
}


// class Solution {
//     public int maxSubArray(int[] arr) {

//         int n = arr.length;
//         int ans = Integer.MIN_VALUE;
//         int curMax = 0;

//         for (int i = 0; i < n; i++) {

//             int v1 = curMax + arr[i];
//             int v2 = arr[i];

//             curMax = Math.max(v1, v2);
//             ans = Math.max(ans, curMax);
//         }

//         return ans;
//     }
// }