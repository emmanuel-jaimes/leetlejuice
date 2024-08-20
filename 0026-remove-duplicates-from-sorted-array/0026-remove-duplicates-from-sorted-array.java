class Solution {
    public int removeDuplicates(int[] nums) {
        // remove duplicates keeping same order (increasing)
        // return unique elements, k

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }

        return i+1;

    }
}