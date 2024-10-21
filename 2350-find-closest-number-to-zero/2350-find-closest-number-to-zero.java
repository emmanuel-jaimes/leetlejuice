class Solution {
    public int findClosestNumber(int[] nums) {
        
        //corner case
        if (nums.length == 1) {
            return nums[0];
        }

        int closest = nums[0];

        //iterate through items
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(closest)) { //check if closer to 0
                closest = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(closest)) { //compare pos/neg 
                if (nums[i] > 0) {
                    closest = nums[i]; //pos exists
                }
            }
        }  //O(n)

        return closest;
    }
}