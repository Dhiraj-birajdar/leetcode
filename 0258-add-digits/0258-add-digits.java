class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        return num % 9 == 0 ? 9 : num % 9;
        // return num != 0 ? 1 + ((num - 1) % 9) : 0;
    }
}

// Digital Root – Revision Note
// Goal: return the digital root of a non-negative integer num

// Definition:
// num == 0 → 0
// otherwise → a value in range 1–9

// Key logic
// num % 9 gives:
// 0 for multiples of 9
// 1–8 otherwise
// But digital root of multiples of 9 is 9, not 0

// Implementation idea
// if (num == 0) return 0;
// return num % 9 == 0 ? 9 : num % 9;

// Equivalent formula
// num != 0 ? 1 + (num - 1) % 9 : 0


// Why it works
// Shifts values so multiples of 9 map to 9 instead of 0
// Both approaches are O(1), no loops, no recursion

// 📌 Remember:
// Digital root = 1 + (num − 1) % 9 (except when num = 0)