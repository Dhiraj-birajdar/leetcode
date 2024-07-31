class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char c : magazine.toCharArray()) {
            ransomNote = ransomNote.replaceFirst(String.valueOf(c), "");
        }
        return ransomNote.isEmpty();
       /*var r = ransomNote.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i, Collectors.counting()));
       var m = magazine.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i, Collectors.counting()));
       
       for(char c: r.keySet()){
           if(m.get(c)==null || m.get(c)<r.get(c))
               return false;
       }
       return true; */
    }
}