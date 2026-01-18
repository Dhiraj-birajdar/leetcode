class Solution {
    public int countDigits(int num) {
        int count=0;
        for(int n=num;n!=0;n=n/10){
            if(num%(n%10)==0)count++;
        }
        return count;
    }
}


// 🧠 Approach
// 🔹 Key Idea
// Extract each digit of num
// Check if num is divisible by that digit
// Increment count if divisible
// 🔁 Algorithm

// Initialize count = 0
// Traverse digits using a temporary variable n = num
// For each digit:
// digit = n % 10
// If num % digit == 0, increment count
// Remove last digit: n = n / 10
// Return count

// ⏱️ Time & Space Complexity
// Time: O(d) where d = number of digits in num
// Space: O(1)

// ⚠️ Important Edge Case
// Digit 0 should be skipped to avoid division by zero
// (LeetCode input guarantees non-zero digits, otherwise add a check)

// 🎯 One-Line Revision Summary
// “Iterate through each digit of the number and count how many digits divide the original number exactly.”