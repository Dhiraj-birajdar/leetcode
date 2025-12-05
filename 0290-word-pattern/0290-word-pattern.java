class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length)
            return false;

        Map<String, Character> sc = new HashMap<>();
        Map<Character, String> cs = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {

            if ((sc.containsKey(sArr[i]) && (!sc.get(sArr[i]).equals(pattern.charAt(i))))
                    || (cs.containsKey(pattern.charAt(i)) && (!cs.get(pattern.charAt(i)).equals(sArr[i]))))
                return false;
            sc.put(sArr[i], pattern.charAt(i));
            cs.put(pattern.charAt(i), sArr[i]);
        }
        return true;
    }
}