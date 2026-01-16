class Solution {
    public int _lengthOfLastWord(String s) {
        return s.trim().substring(s.trim().lastIndexOf(" ")+1).length();
    }
    
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(int i=s.length()-1;i>=0 && s.charAt(i)!=' ';i--){
            count++;
        }
        return count;
    }
}