import java.util.Stack;

public class Q04_postfix {
    public static int evaluatePostfix(String expression) {
        
        Stack<Integer> stack = new Stack<Integer>();

      
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

           
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            // If the character is an operator, pop two operands from stack and evaluate
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;

                    case '-':
                        stack.push(operand1 - operand2);
                        break;

                    case '*':
                        stack.push(operand1 * operand2);
                        break;

                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "34+5*";
        int result = evaluatePostfix(expression);
        System.out.println("Postfix expression: " + expression);
        System.out.println("Result: " + result);
    }
}
