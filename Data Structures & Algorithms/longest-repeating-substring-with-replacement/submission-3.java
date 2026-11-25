class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        HashSet<Character> charSet = new HashSet<>();

        // Find all unique characters in the string.
        for(char c: s.toCharArray()){
            charSet.add(c);
        }

        // Pick one character, for example A.
        for(char c: charSet){
            // Expand a sliding window from left to right.
            int count = 0, l = 0;

            for(int r = 0; r < s.length(); r++){
                // Count how many As exist in that window.
                if(s.charAt(r) == c) count ++;
            
            // Calculate how many characters need replacement: window length - count.
            // If replacements exceed k, shrink the window from the left.
                while((r - l + 1) - count > k){
                    if(s.charAt(l) == c) count--;
                    l++;
                }

                // Record the longest valid window.
                result = Math.max(r - l + 1, result);
            }
        }
    
        // Return the maximum length found.
        return result;
    }
}
