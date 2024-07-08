// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Pop corresponding '(' from stack for ')'
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // Pop corresponding '{' from stack for '}'
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // Pop corresponding '[' from stack for ']'
            } else {
                return false; // Invalid case: mismatched or closing bracket without opening
            }
        }
        
        return stack.isEmpty(); // Stack should be empty if all brackets are matched
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.isValid("()")); // Output: true
        System.out.println(solution.isValid("()[]{}")); // Output: true
        System.out.println(solution.isValid("(]")); // Output: false
        System.out.println(solution.isValid("([)]")); // Output: false
        System.out.println(solution.isValid("{[]}")); // Output: true
        System.out.println(solution.isValid("")); // Output: true
    }
}
