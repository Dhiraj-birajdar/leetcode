class Solution {
    public int countKeyChanges(String s) {
        int r = 0;
        s = s.toLowerCase();
        for(int i = 1; i<s.length(); i++)
        {
            if(s.charAt(i-1) != s.charAt(i)){
                r++;
            }
        }
        return r;
    }
}