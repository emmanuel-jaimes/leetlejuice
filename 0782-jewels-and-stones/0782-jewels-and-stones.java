class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> jwls = new HashSet<>(); 
        HashMap<String, Integer> map = new HashMap<>();
        
        //identify types of jewels
        for (int i = 0; i < jewels.length(); i++) { //O(n)
            jwls.add(String.valueOf(jewels.charAt(i)));
        }

        //identify jewels from stones
        for (int i = 0; i < stones.length(); i++) {
            String stone = String.valueOf(stones.charAt(i));
            if (jwls.contains(stone)) {
                int frequency = map.getOrDefault(stone, 0);
                map.put(stone, frequency+1);
            }
        }

        int totaljwls = 0;
        for (int freq : map.values()) {
            totaljwls += freq;
        }

        return totaljwls;
    }
}