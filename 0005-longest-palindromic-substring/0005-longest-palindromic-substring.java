class Solution {
    public String longestPalindrome(String s) {
        
        if (s == null || s.length() < 1) return "";
        
        String largestPalindrome = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            String oddPalindrome = expandAroundCenter(s, i, i);
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            
            String longerPalindrome = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;
            
            if (longerPalindrome.length() > maxLen) {
                largestPalindrome = longerPalindrome;
                maxLen = longerPalindrome.length();
            }
        }
        
        return largestPalindrome;
    }

    // expand around the center and find the longest palindrome
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
}
