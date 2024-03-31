class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
      char c;
      int i = 0, j = s.length()-1;
      while(i<j){
        while(i<j && !s.substring(i,i+1).matches("[aeiouAEIOU]"))
          i++;
        while(i<j && !s.substring(j,j+1).matches("[aeiouAEIOU]"))
          j--;
        c = a[i];
        a[i++] = a[j];
        a[j--] = c;
      }      
      return new String(a);
    }
}