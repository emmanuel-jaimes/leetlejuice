import java.util.Stack;

class Solution {
    public int romanToInt(String s) {
        //problem where order sequence matters
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));
            
            // if current numeral is smaller than the next, it's a subtraction case
            if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                result -= currentVal;  
            } else {
                result += currentVal; 
            }
        }
        
        return result;  
        // push ( V, I, I ) = "VII" = 7
        // stack (I, I, V) 

        //"XIV" => push (X, I, V) = 14
        // stack (V, I, X) 
    }
}