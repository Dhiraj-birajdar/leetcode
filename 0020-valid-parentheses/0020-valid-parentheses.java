class Solution {
    public boolean isValid(String s) {
        //use Deque instead of Stack as it is legacy class kept for backward compatibility
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (map.get(stack.peek()) == c) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
// Intuition

// Every closing bracket must match the most recent unmatched opening bracket

// This is a Last In, First Out (LIFO) problem → use a stack

// A map stores valid opening → closing bracket pairs so matching logic stays simple and extensible

// Data Structures Used

// Stack (Deque) → keeps track of opening brackets

// Map → defines valid bracket pairs
// Example:

// '(' → ')'
// '{' → '}'
// '[' → ']'

// Approach

// Create a map of opening → closing brackets

// Initialize an empty stack

// Traverse the string character by character:

// If the character is an opening bracket:

// Push it onto the stack

// Else (closing bracket):

// If stack is empty → invalid (no opening to match)

// Check top of stack:

// If map[top] matches current closing bracket → pop

// Else → invalid

// After traversal:

// If stack is empty → valid

// Else → invalid (unmatched openings remain)

// Why Map-Based Matching Works

// Centralizes bracket rules in one place

// Avoids multiple conditional checks

// Easy to extend (add new bracket types)

// Improves readability and maintainability

// Edge Cases Handled

// Closing bracket before any opening → ❌

// Mismatched pair (e.g. (]) → ❌

// Extra opening brackets left in stack → ❌

// Empty string → ✅

// Time & Space Complexity

// Time: O(n) — single pass through string

// Space: O(n) — stack in worst case (all openings)

    public boolean _isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
//     Intuition
// We need to check if every opening bracket has a corresponding closing bracket in the correct order. A stack is a natural choice because it follows Last-In-First-Out (LIFO), which matches the bracket pairing rule.

// Approach
// Traverse the string character by character.

// If it is an opening bracket ((, [, {), push it onto the stack.

// If it is a closing bracket (), ], }):

// Check if the stack is empty → if yes, return False.

// Otherwise, pop from the stack and ensure the popped element matches the type of closing bracket.

// If not matching, return False.

// At the end, if the stack is empty, return True; otherwise, False.

// Complexity
// Time complexity:
// O(n) — we traverse the string once.

// Space complexity:
// O(n) — in the worst case, all characters are opening brackets stored in the stack.
}