class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Character> sm = new LinkedHashMap<>();
        Map<Character, Character> tm = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if ((sm.containsKey(s.charAt(i)) && (!sm.get(s.charAt(i)).equals(t.charAt(i))))
                    || (tm.containsKey(t.charAt(i)) && (!tm.get(t.charAt(i)).equals(s.charAt(i)))))
                return false;
            sm.put(s.charAt(i), t.charAt(i));
            tm.put(t.charAt(i), s.charAt(i));
        }

        return true;
    }
}