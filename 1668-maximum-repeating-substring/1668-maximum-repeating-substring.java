class Solution {

//Dynamic Programming
public int maxRepeating(String sequence, String word) {
    int n = sequence.length();
    int m = word.length();
    int[] dp = new int[n + 1];
    int maxRepeat = 0;

    for (int i = m; i <= n; i++) {
        if (sequence.substring(i - m, i).equals(word)) {
            dp[i] = dp[i - m] + 1;
            maxRepeat = Math.max(maxRepeat, dp[i]);
        }
    }

    return maxRepeat;
}

    public int __maxRepeating(String sequence, String word) {
        int count = 0;
        while (sequence.contains(word)) {
            count++;
            word += word;
        }
        return count;
    }

    public int _maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder repeatedWord = new StringBuilder(word);

        while (sequence.contains(repeatedWord.toString())) {
            count++;
            repeatedWord.append(word);
        }

        return count;
    }
}

// 🧠 Approach: Dynamic Programming (DP)
// 🔹 Core Idea
// Use a DP array to track how many times word repeats consecutively ending at a given index.
// 🔹 DP Definition
// dp[i] = number of consecutive occurrences of `word`
//         ending exactly at index i (exclusive)
// 🔁 Algorithm Steps
// Let:
// n = sequence.length()
// m = word.length()

// Create an integer array dp of size n + 1
// Iterate from i = m to n
// At each index i:
// Check if sequence.substring(i - m, i) equals word
// If yes:
// dp[i] = dp[i - m] + 1
// Update maxRepeat
// Return maxRepeat

// 💡 Why This Works

// If word ends at index i
// And another word ended at i - m
// Then the repetition count can be extended by 1
// This ensures only consecutive repetitions are counted.
// 🧩 Example
// sequence = "ababcababcababc"
// word     = "ababc"
// Matches end at indices: 5, 10, 15
// dp values:              1,  2,  3
// Answer = 3
// ⏱️ Time Complexity
// O(n × m)
// Loop runs n times
// Each substring comparison takes O(m)
// 🗂️ Space Complexity
// O(n)

// DP array of size n + 1
// ⚖️ Pros & Cons
// ✅ Pros
// Easy to understand
// Clean DP formulation
// Interview-friendly

// ❌ Cons
// Extra space usage
// Substring comparison makes it slower than KMP
// 🎯 One-Line Revision Summary

// “Use DP where dp[i] stores how many times word repeats consecutively ending at index i; extend the count using dp[i - m] + 1.”