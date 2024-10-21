class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagramSet = new HashMap<>();

        for (String str : strs) { //iterate through items
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if (!anagramSet.containsKey(sorted)) { //new anagram
                anagramSet.put(sorted, new ArrayList<>()); //add new anagram to list w sorted as key
            }
            anagramSet.get(sorted).add(str); //append to existing
            
        }

        return new ArrayList<>(anagramSet.values());
    }
}