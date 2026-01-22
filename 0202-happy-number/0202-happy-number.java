class Solution {

    //Floyd's tortoise and hare method
    // Time complexity: O(N)
    // Space complexity: O(1)
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
            // if(slow==1) return true; 
            //no need to check as at one point both will be 1 if happy
        } while (slow != fast);
        return slow == 1;
        //so in both case happy or not both slow and fast will be equal 
        //then just check if they are 1 or not
    }

    //my solution
    //// Time complexity: O(N)
    // Space complexity: O(N)
    public boolean _isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            n = digitSquareSum(n);
            if (!set.add(n))
                return false;
        }
        return true;

    }

    private int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += (rem * rem);
            n = n / 10;
        }
        return sum;
    }
}
// 1️⃣ Floyd’s Tortoise and Hare Approach (Optimized)
// Approach:
// Treat the process of replacing a number with the sum of squares of its digits as a linked sequence.
// Use two pointers:
// slow moves one step (one digitSquareSum)
// fast moves two steps (two digitSquareSum calls)
// If the number is happy, both pointers will eventually meet at 1.
// If not, they will meet at some other number, indicating a cycle.

// Why it works:
// Any non-happy number eventually enters a cycle that does not include 1.
// Time Complexity: O(N)
// Space Complexity: O(1)

// 2️⃣ HashSet-Based Approach (Cycle Detection Using Memory)
// Approach:
// Repeatedly replace the number with the sum of squares of its digits.
// Store each intermediate value in a HashSet.
// If the number becomes 1, it is happy.
// If a value repeats, a cycle is detected → not a happy number.

// Why it works:
// Repeating a value means we are stuck in a loop and will never reach 1.
// Time Complexity: O(N)
// Space Complexity: O(N) (due to HashSet)

// 📝 Quick Comparison Note (for revision)
// Floyd’s approach: More optimal, no extra space
// HashSet approach: Easier to understand, uses extra memory
// Both rely on cycle detection in the digit-square transformation sequence