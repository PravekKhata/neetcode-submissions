class Solution {
    public void reverseString(char[] s) {
        
        int len = s.length;
        char[] reverse = new char[len];

        int j = 0;
        for(int i = len - 1; i >= 0; i--){
            reverse[j++] = s[i];
        }

        for(int i = 0; i < len; i++){
            s[i] = reverse[i];
        }
    }
}