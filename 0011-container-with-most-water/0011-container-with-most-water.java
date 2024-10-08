class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int a = 0, b = height.length-1;
        
        while ( a < b )
        {
            if (height[a] < height[b])
            {
                max = Math.max(max, height[a] * (b-a) );
                a++;
            }
            else 
            {
                max = Math.max(max, height[b] * (b-a) );
                b--;
            }
        }
        
        return max;
        
    }
}