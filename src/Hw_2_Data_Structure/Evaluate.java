package Hw_2_Data_Structure;
import java.util.*;

public class Evaluate {

    // Fill the method and return the value
    static String infixToPostfix(String expression) {
        //Do not forget to delete return "" statement

        Stack<Character> stack = new Stack<>();
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if (c != '*' && c != '/' && c != '-' && c != '+' && c != '(' && c != ')'){
                StringBuilder operand = new StringBuilder();
                operand.append(c);
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    operand.append(expression.charAt(++i));
                }
                message.append(operand).append(" ");
            }
            else if (stack.isEmpty()){
                stack.push(c);
            } else if (c == '*' || c == '/') {
                while (stack.peek() == '*' || stack.peek() == '/'){
                    message.append(stack.pop());
                    message.append(" ");
                }
                stack.push(c);
            } else if (c == '+' || c == '-') {
                while (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/'){
                    message.append(stack.pop());
                    message.append(" ");
                    if (stack.isEmpty()){ //I checked is it empty or not. With this way I prevented encountering the error
                        break;
                    }
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else {
                while (stack.peek() != '('){
                    message.append(stack.pop());
                    message.append(" ");
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            message.append(stack.pop());
            message.append(" ");
        }

        // Convert StringBuilder to String
        return message.toString();
    }

    // Fill the method and return the value
    static int evaluatePostfixExpression(String expression)
    {
        Stack<Integer> stack = new Stack<>();
        //Do not forget to delete return 0 statement
        String[] array = expression.split(" ");
        for (String c : array) {
            if (!c.equals("*") && !c.equals("/") && !c.equals("-") && !c.equals("+") && !c.equals("(") && !c.equals(")")) {
                // If the character is a digit, push it onto the stack
                int value = Integer.parseInt(c);
                stack.push(value);
            } else {
                // If the character is an operator, pop operands, perform operation, and push result
                int operand2 = (int) stack.pop();
                int operand1 = stack.pop();

                switch (c) {
                    case "+" -> stack.push(operand1 + operand2);
                    case "-" -> stack.push(operand1 - operand2);
                    case "*" -> stack.push(operand1 * operand2);
                    case "/" -> stack.push(operand1 / operand2);

                    // Add more operators if needed
                }
            }
        }

        // The final result should be on the top of the stack
        return stack.pop();
    }

}











