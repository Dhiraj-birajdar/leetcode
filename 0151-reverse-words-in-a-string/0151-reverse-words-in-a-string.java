class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().replaceAll("\\s+"," ").split(" ");
        s="";
        for(String w: a)
            s= w +" "+s;
        return s.trim();
    }
}