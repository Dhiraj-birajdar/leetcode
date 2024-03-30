class Solution {
    public String mergeAlternately(String word1, String word2) {
        int c = 0;
        StringBuilder s = new StringBuilder();
        while(c< word1.length() || c< word2.length()){
            if(c<word1.length())
                s.append(word1.charAt(c));
            if(c<word2.length())
                s.append(word2.charAt(c));
            c++;
        }
        return s.toString();
    }
}