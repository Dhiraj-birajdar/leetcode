class Solution {
    public String reverseWords(String s) {
        // String[] words = s.split(" +");
        // StringBuilder sb = new StringBuilder();
        // for(int i=words.length-1;i>=0;i--){
        //     sb.append(words[i]).append(" ");
        // }
        // return sb.toString().strip();

        String a[] = s.split("\\s+");
        s = "";
        for (String w : a)
            s = w + " " + s;
        return s.strip();
    }
}