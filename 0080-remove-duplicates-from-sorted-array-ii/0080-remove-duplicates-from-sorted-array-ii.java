class Solution {
    public int removeDuplicates(int[] nums) {
        // array never will be empty

        int i = 1; // from second element
        int count = 1; // count occurrences

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) { // Same as previous
                count++;
            } else {
                count = 1; // Reset count for unique element
            }

            if (count <= 2) { // Allow at most two occurrences
                nums[i] = nums[j]; // merge
                i++; // move pointer forward
            }
        }

        return i;
    }
}