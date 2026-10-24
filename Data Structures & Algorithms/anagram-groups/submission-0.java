class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> groupAnagram = new HashMap<>();

        // find anagrams
        for(String str: strs){

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if(!groupAnagram.containsKey(sortedString)){
                groupAnagram.put(sortedString, new ArrayList<>());
            }
            groupAnagram.get(sortedString).add(str);
            
        }

        return new ArrayList<> (groupAnagram.values());
    }
}
