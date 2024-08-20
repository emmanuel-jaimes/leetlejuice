class Solution {
    public int removeElement(int[] nums, int val) {
        // remove all occurrences of [val] in nums[] in place
        // return # of elements in nums[] != val
        // shift elements to front of list
        // return k, k = nums.size - # of removed elements

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val )
            {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}