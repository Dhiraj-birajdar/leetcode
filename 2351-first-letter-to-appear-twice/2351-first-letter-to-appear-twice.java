class Solution {
    //most optimal
    public char repeatedCharacter(String s) {
        boolean[] arr = new boolean[26];
        for(char c:s.toCharArray()){
            if(arr[c-'a']) return c;
            arr[c-'a']=true;
        }
        return '\n';    
    }
    
    public char _repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray())
            if(!set.add(c)) return c;
        return '\n';    
    }

    //unicode safe
    public char unicode_repeatedCharacter(String s) {
        Set<Integer> set = new HashSet<>();
        for(int c:s.codePoints().boxed().toList())
            if(!set.add(c)) return (char)c;
        return '\n';    
    }
}

// **Repeated Character – Revision Notes**

// **Problem**
// Return the **first character that appears more than once** in a string.

// ---

// ### 1️⃣ Boolean array (most optimal – lowercase English letters)

// ```java
// boolean[] arr = new boolean[26];
// ```

// * Assumes characters are `'a'`–`'z'`
// * Index via `c - 'a'`
// * If already seen → return immediately

// **Complexity**

// * Time: **O(n)**
// * Space: **O(1)** (fixed 26)

// ✔ Fastest
// ❌ Not Unicode-safe

// ---

// ### 2️⃣ HashSet (generic solution)

// ```java
// Set<Character> set = new HashSet<>();
// ```

// * Works for any `char`
// * `set.add(c)` returns `false` if already present

// **Complexity**

// * Time: **O(n)**
// * Space: **O(n)**

// ✔ Simple & readable
// ❌ Slightly more memory

// ---

// ### 3️⃣ Unicode-safe (code points)

// ```java
// s.codePoints()
// ```

// * Handles surrogate pairs (emojis, non-BMP chars)
// * Uses `int` code points instead of `char`

// **Complexity**

// * Time: **O(n)**
// * Space: **O(n)**

// ✔ Correct for full Unicode
// ❌ Heavier than needed for ASCII problems

// ---

// ### Return value

// * Returns `'\n'` if no repeated character found (problem-dependent)

// ---

// 📌 **Remember**

// * Use **boolean[26]** when input is guaranteed lowercase English letters
// * Use **HashSet<Character>** for general cases
// * Use **codePoints()** when Unicode correctness matters
