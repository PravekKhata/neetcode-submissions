class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int common = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());

        for (int i = 0; i < common; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        sb.append(word1.substring(common));   // empty if word1 is the shorter one
        sb.append(word2.substring(common));   // empty if word2 is the shorter one

        return sb.toString();
    }
}