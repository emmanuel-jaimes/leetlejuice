class Solution {
    public int findClosestNumber(int[] nums) {
        
        //corner case
        if (nums.length == 1) {
            return nums[0];
        }

        int last = nums[0]; 
        List<Integer> closest = new ArrayList<>();
        closest.add(last);

        //iterate through items
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(last)) { //check if closer to 0
                closest.set(0, nums[i]);
                last = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(last)) { //compare pos/neg 
                if (nums[i] > 0) {
                    closest.set(0, nums[i]);
                }
            }
        }  //end of iteration

        return closest.get(0);
    }
}