class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // using sliding window with frequency arrays
        int s1Length = s1.length();
        int s2Length = s2.length();

        if (s1Length > s2Length) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Build frequency arrays for the first window
        for (int i = 0; i < s1Length; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(s1Count, s2Count)) {
            return true;
        }

        // Slide the window through s2
        for (int right = s1Length; right < s2Length; right++) {

            // Remove the character leaving the window
            char outgoingCharacter = s2.charAt(right - s1Length);
            s2Count[outgoingCharacter - 'a']--;

            // Add the character entering the window
            char incomingCharacter = s2.charAt(right);
            s2Count[incomingCharacter - 'a']++;

            // Compare character frequencies
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }
}