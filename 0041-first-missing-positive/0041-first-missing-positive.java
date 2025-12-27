class Solution {
    public int firstMissingPositive(int[] nums) {
        
        // pass through turn all negative numbers to 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if ( 1 <= val && val <= nums.length) {
                if( nums[val-1] > 0) {
                    nums[val-1] *= -1; // mark positive value
                } else if (nums[val-1] == 0) {
                    nums[val - 1] = - (nums.length + 1);
                }
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i -1] >= 0) {
                return i;
            }
        }
        return nums.length+1;

    }
}