class Solution {
    public boolean isFascinating(int n) {
        // String s = String.valueOf(n) + String.valueOf(2*n) + String.valueOf(3*n);
        String s = n+""+(2*n)+(3*n);
        // Integer.toString(n);
        if(s.length()!=9) return false;
        for(int i = 1; i<=9; i++)
		    if(!s.contains(""+i)) return false;
        return true;
    }
}