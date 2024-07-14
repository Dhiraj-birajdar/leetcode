class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i)))
                m.put(s.charAt(i),-1);
            else
                m.put(s.charAt(i),i);
        }
        for(int i: m.values()){
            if(i!=-1)
                return i;
        }
        return -1;
    }
}