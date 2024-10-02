class Solution {
    public String intToRoman(int num) {
        
        String[] romanChar = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanVal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < romanVal.length; i++) {
            
            while (romanVal[i] <= num) {
                roman.append(romanChar[i]);
                num -= romanVal[i];
            }
        }

        return roman.toString();
    }
}