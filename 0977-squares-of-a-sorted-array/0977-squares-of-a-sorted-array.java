// // brute force

// class Solution {
//     public int[] sortedSquares(int[] nums) {
        
//         for(int i = 0 ; i <nums.length ; i++){
//             nums[i] = nums[i]*nums[i];
//         }

//         Arrays.sort(nums);

//         return nums;
//     }
// }

// optimised approach

// class Solution {
//     public int[] sortedSquares(int[] nums) {

//         int[] ans = new int[nums.length];
//         int left = 0;
//         int right = nums.length-1;
//         int index = nums.length-1;

//         while(left <=  right){
//             int rightSq = nums[right] * nums[right];
//             int leftSq = nums[left] * nums[left];

//             if(rightSq <= leftSq){
//                 ans[index] = leftSq;
//                 left++;
//                 index--;
//             }
//             else{
//                 ans[index] = rightSq;
//                 right--;
//                 index--;
//             }
//         } 
//         return ans;
//     }
// }



class Solution {
    public static int[] sortedSquares(int[] nums) {

        int[] squaredNums = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int index = nums.length - 1;

        while (i <= j) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                squaredNums[index] = nums[i] * nums[i];
                i++;
            } else {
                squaredNums[index] = nums[j] * nums[j];
                j--;
            }

            index--;
        }

        return squaredNums;
    }
}