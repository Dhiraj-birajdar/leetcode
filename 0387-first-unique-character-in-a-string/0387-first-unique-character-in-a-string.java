class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),-1);
            }
            else
                m.put(s.charAt(i),i);
        }
        // System.out.println(m);
        for(char c: m.keySet()){
            if(m.get(c)!=-1)
                return m.get(c);
        }
        return -1;

    }
}