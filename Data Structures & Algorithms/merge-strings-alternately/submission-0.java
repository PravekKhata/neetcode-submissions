class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int len = word1.length();
        String extraChar = "";
        if(word1.length() < word2.length()){
            extraChar = word2.substring(len);
        }else if(word1.length() > word2.length()){
            len = word2.length();
            extraChar = word1.substring(len);
        }

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < len; i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        
        str.append(extraChar);
        return str.toString();
    }
}