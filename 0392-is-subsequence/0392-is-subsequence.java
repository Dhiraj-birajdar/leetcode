class Solution {
    public boolean isSubsequence(String s, String t) {

        // if(t.isEmpty() || s.equals("")) return false;
        
        int i = 0, j = 0;
        while( i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i == s.length()? true: false;
    }
}