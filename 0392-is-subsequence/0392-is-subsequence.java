class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() > t.length()) return false;
        if(s.length() == t.length()) return s.equals(t);
        int l = 0, r = 0;
        while( l<s.length() && r < t.length()){
            if(s.charAt(l) == t.charAt(r)){
                l++;
                r++;
            }else
                r++;
        }
        return l == s.length()? true: false;
    }
}