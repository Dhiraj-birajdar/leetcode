class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], result.get(result.size() - 1))) {
                result.add(words[i]);
            }
        }
        return result;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            count[c1 - 'a'] += 1;
            count[c2 - 'a'] -= 1;
        }
        for (int i : count)
            if (i != 0)
                return false;
        return true;
    }
}

// Approach:
// Maintain a result list that always keeps the last non-anagram word.
// Start by adding the first word. Then iterate through the remaining words and compare each word only with the last added word in the result list.

// To check if two words are anagrams, use a frequency array of size 26:
// Increment the count for each character in the first word
// Decrement the count for each character in the second word
// If all counts are zero, the words are anagrams
// If the current word is not an anagram of the previous kept word, add it to the result.

// Why it works:
// Only consecutive anagrams need to be removed, so comparing with the last kept word is sufficient.

// Time Complexity: O(N * L)
// where N is the number of words and L is the word length
// Space Complexity: O(1) (constant 26-size array, excluding output list)