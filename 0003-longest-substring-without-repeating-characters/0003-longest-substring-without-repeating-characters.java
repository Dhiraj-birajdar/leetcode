import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[128];
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (seen[c]) {
                seen[s.charAt(left)] = false;
                left++;
            }

            seen[c] = true;
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}

//best for interview
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int res = 0;
//         int left = 0;
//         Set<Character> charSet = new HashSet<>();
        
//         for (int right = 0; right < n; right++) {
//             while (charSet.contains(s.charAt(right))) {
//                 charSet.remove(s.charAt(left));
//                 left++;
//             }
//             charSet.add(s.charAt(right));
//             res = Math.max(res, right - left + 1);
//         }
//         return res;
//     }
// }

// 🧠 Explanation

// I use a HashSet to store characters in the current window.

// When the character at right already exists:

// I remove characters from the left until the duplicate is removed

// Then I expand the window again and update the result

// 📌 Why this works

// HashSet ensures uniqueness

// Logic is very intuitive and easy to reason about

// Commonly expected solution in interviews

// ⏱ Complexity

// Time: O(n)

// Space: O(n) in worst case (distinct characters)

// 🔍 Comparison (What I’d Tell the Interviewer)
// Aspect	boolean[128]	HashSet
// Lookup speed	🚀 Fast (array)	Slower (hashing)
// Space	O(1)	O(n)
// Autoboxing	❌ No	✅ Yes (Character)
// Readability	Medium	⭐⭐⭐⭐⭐
// Interview friendliness	High	Very High
// 🏆 Final Statement (Strong Interview Finish)

// “Both approaches use the sliding window technique with O(n) time complexity.
// The HashSet version is more intuitive and commonly used, while the boolean array version is an optimized solution that avoids hashing and object creation, making it faster in practice. If the input is guaranteed to be ASCII, I prefer the boolean array approach.”

//set approach my
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length()<=1) return s.length();
//         int maxLength=0;
//         Set<Character> set = new HashSet<>();
//         for(int r=0,l=0;l<s.length();l++){
//             if(set.contains(s.charAt(l))){
//                 while(s.charAt(l)!=s.charAt(r)){
//                     set.remove(s.charAt(r));
//                     r++;
//                 }
//                 r++;
//             }else{
//                 set.add(s.charAt(l));
//                 maxLength = Math.max(maxLength,(l-r+1));
//             }
//         }
//         return maxLength;
//     }
// }