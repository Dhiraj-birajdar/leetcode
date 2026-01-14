class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        while(n%2==0) n=n/2;
        while(n%3==0) n=n/3;
        while(n%5==0) n=n/5;
        return n==1;
    }
}

// Ugly Number – Revision Note
// Ugly numbers are positive integers whose only prime factors are 2, 3, and 5
// 1 is considered ugly
// Non-positive numbers are not ugly

// Approach
// Repeatedly divide n by 2, 3, and 5 while divisible
// Remove all allowed prime factors
// If the final value is 1, the number is ugly

// Code idea
// if (n <= 0) return false;
// while (n % 2 == 0) n /= 2;
// while (n % 3 == 0) n /= 3;
// while (n % 5 == 0) n /= 5;
// return n == 1;


// Complexity
// Time: O(log n)
// Space: O(1)

// 📌 Remember:
// Strip all factors of 2, 3, and 5 — if anything else remains, it’s not ugly.