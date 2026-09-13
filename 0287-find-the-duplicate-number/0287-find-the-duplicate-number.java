class Solution {
    public int findDuplicate(int[] nums) {
        int fast=nums[0], slow = nums[0];

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast){
                slow = nums[0];
                while(fast != slow){
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
    }
}


