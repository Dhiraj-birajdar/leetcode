class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        for(int i=0;i<k;max+=(s.substring(i,i+1).matches("[aeiou]")?1:0),i++);
        if(k==max) return k;
        int n = max;
        for(int i=1;i+k-1<s.length();i++){
            if(s.substring(i-1,i).matches("[aeiou]")) n-=1;
            if(s.substring(i+k-1,i+k).matches("[aeiou]")) n+=1;
            if(n>max) max = n;
        }
        return max;
    }
}