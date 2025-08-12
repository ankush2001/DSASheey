package CrioDsa101;

public class PostfixExpression {
    /**
     * This method evaluates a postfix expression.
     * The expression is expected to be in the form of a string with space-separated tokens.
     * It supports basic arithmetic operations: addition, subtraction, multiplication, and division.
     *
     * @param expression the postfix expression to evaluate
     * @return the result of the evaluated expression
     */
    static int evaluatePostfix(String expression) {
        // Split the expression into tokens based on spaces
        String[] tokens = expression.split(" ");
        // Create a stack to hold the operands
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        // Iterate through each token in the expression
        for (String token : tokens) {
            // Check if the token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Pop the top two operands from the stack
                int b = stack.pop();
                int a = stack.pop();
                int result;

                // Perform the operation based on the operator
                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b; // Assuming no division by zero in input
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
                // Push the result back onto the stack
                stack.push(result);
            } else {
                // If it's not an operator, it must be an operand (number)
                stack.push(Integer.parseInt(token));
            }
        }

        // The final result will be the only element left in the stack
        return stack.pop();
    }
    public static void main(String[] args) {
        // Example usage of postfix expression evaluation
        String expression = "5 3 8 + 2 *"; // Equivalent to 5 + (3 + 8) * 2
//        int result = evaluatePostfix(expression);
//        System.out.println("Result of the postfix expression: " + result); // Output: 16
    }
}
