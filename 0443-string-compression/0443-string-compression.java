class Solution {
    public int compress(char[] chars) {
        if(chars.length <= 1) return chars.length;
        String s = "";
        int i = 0, j = 1;
        while(j<chars.length){
            while(j<chars.length && chars[i] == chars[j]){
                j++;
            }
            if(j-i == 1){
                s+= chars[i];
                i = j++;
            }
            if(j-i >= 2){
                s+= chars[i];
                s+= (j-i);
                i = j++;
            }
            if(i == chars.length-1){
                s+=chars[i];
                break;
            }
        }
        for(i=0;i<s.length();i++)
        chars[i] = s.charAt(i);

        return s.length();
    }
}