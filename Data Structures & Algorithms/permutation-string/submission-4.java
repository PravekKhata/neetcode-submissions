class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        
        for(Character ch: s1.toCharArray()){
            s1Count[ch - 'a'] ++;
        }

        for(int i = 0; i <= s2.length() - s1.length(); i++){

            int[] visited = new int[26];

            for(int j = i; j < i + s1.length(); j++){
                char ch = s2.charAt(j);
                visited[ch - 'a']++;
            }

            if(Arrays.equals(s1Count, visited)) return true;
        }

        return false;
    }
}
