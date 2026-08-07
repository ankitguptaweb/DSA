class Solution {
    public int[] twoSum(int[] number, int target) {
//first leetcode problem
        int start = 0;
        int end = number.length - 1;

        while(start < end){

            int sum = number[start] + number[end];

            if(sum == target){
                return new int[]{start + 1, end + 1};
            }
            else if(sum < target){
                start++;
            }
            else{
                end--;
            }
        }

        return new int[]{-1, -1};
    }
}