package Crio;

import java.util.Stack;

public class ValidParenthesis

{
    /**
     * This method checks if a given string of parentheses is valid.
     * A string is considered valid if:
     * - Every opening parenthesis has a corresponding closing parenthesis.
     * - Parentheses are closed in the correct order.
     *
     * @param s the input string containing parentheses
     * @return true if the string is valid, false otherwise
     */

        // Implement your solution here
        public static String isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(char ch : s.toCharArray()){
                if(ch == '(' || ch == '{' || ch == '['){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty()){
                       return "false"; // If stack is empty, no matching opening parenthesis
                        }
                    char pop = stack.pop();
                    if(pop == '(' && ch != ')' ||
                            pop == '[' && ch != ']' ||
                            pop == '{' && ch != '}'   ){
                        return "false";
                    }
                }
            }
            return stack.isEmpty() ? "true" : "false";
        }

    public static void main(String[] args) {
        String s = "({[]})";
        String isValid = isValid(s);
        System.out.println("Is the string valid? " + isValid); // Output: true
    }
}
