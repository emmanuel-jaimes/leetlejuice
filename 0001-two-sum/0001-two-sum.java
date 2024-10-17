class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int j = i+1;

            while (j != nums.length) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
                j++;
            }
        }

        return indices;
    }
}