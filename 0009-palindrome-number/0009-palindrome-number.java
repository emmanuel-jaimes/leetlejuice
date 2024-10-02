class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int i = 0;


        // first check
        if (num.charAt(0) != num.charAt(num.length()-1)) {
            return false;
        } else {
            while (num.charAt(i) == num.charAt(num.length()-i-1) && i < num.length()/2) 
            {
                i++;
            }
        }

        if (i == num.length()/2) {
            return true;
        }
        return false;
    }
}