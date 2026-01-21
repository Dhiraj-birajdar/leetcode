class Solution {
    public int countOdds(int low, int high) {
        return (int)(Math.ceil(high/2.0)-low/2);
        // return (int)(Math.ceil(high/2.0)-Math.floor(low/2.0));
        // return (high + 1) / 2 - (low / 2);
    }
}

// Key Insight
// Odd numbers appear every two steps:

// 0 (even)
// 1 (odd)
// 2 (even)
// 3 (odd)
// 4 (even)
// 5 (odd)
// ...
// So, if we know how many odds exist from 0 to x, we can find odds in any range.

// Count of odd numbers from 0 to x
// For any integer x, the count of odds up to x is:

// (x + 1) // 2

// Why?

// If x is odd, say 7 → odds are 1,3,5,7 → 4 numbers = (7+1)//2
// If x is even, say 10 → odds are 1,3,5,7,9 → 5 numbers = (10+1)//2
// This single observation is the heart of the solution.

// Count of odds between low and high
// To find odds in the range [low, high], compute:

// odds up to high   −   odds up to (low - 1)
// But there's an even cleaner equivalent expression:

// (high + 1) // 2  -  (low // 2)
// This works because low // 2 directly gives how many odds exist before low.