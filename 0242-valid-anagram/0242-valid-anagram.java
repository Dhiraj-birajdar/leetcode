class Solution {

    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a'] += 1;
            count[s2.charAt(i) - 'a'] -= 1;
        }
        for (int i : count)
            if (i != 0)
                return false;
        return true;
    }

    public boolean _isAnagram(String s, String t) {
        int[] alpha = new int[26];
        for (char c : s.toCharArray()) {
            alpha[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            alpha[c - 'a'] -= 1;
        }
        for (int i : alpha) {
            if (i != 0)
                return false;
        }
        return true;
    }

    //use map for unicode characters
    //Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
    public boolean isAnagramUnicode(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Integer, Integer> freq = new HashMap<>();

        s.codePoints().forEach(cp -> freq.put(cp, freq.getOrDefault(cp, 0) + 1));
        t.codePoints().forEach(cp -> freq.put(cp, freq.getOrDefault(cp, 0) - 1));

        for (int count : freq.values()) {
            if (count != 0)
                return false;
        }
        return true;
    }

}

// Approach (Anagram Check using Character Frequency):
// Both methods determine whether two strings are anagrams by counting the frequency of each lowercase English letter using an array of size 26.

// _isAnagram
// Count occurrences of each character in the first string.
// Decrease the count using characters from the second string.
// If all counts return to zero, the strings are anagrams.

// isAnagram
// First check if the lengths differ; if so, they cannot be anagrams.
// Traverse both strings in a single loop, incrementing the count for characters in the first string and decrementing for the second.
// Verify that all counts are zero.

// Why it works:
// Anagrams have the same characters with the same frequencies. Any mismatch leaves a non-zero count.

// Time Complexity: O(n) where n is the string length
// Space Complexity: O(1) (fixed-size 26 array)

// Note:
// The second method is slightly more efficient and cleaner because it combines counting into one loop and avoids unnecessary work when lengths differ.