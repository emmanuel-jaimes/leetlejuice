class Solution {
    public int[] twoSum(int[] nums, int target) {
        //improved approach

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (numMap.containsKey(difference)) {
                return new int[] {numMap.get(difference), i}; //finds solution
            }
            numMap.put(nums[i], i); //no solution
        }

        return null; 
    }
}