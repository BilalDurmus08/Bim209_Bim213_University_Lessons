package Hw_2_Data_Structure;
import java.util.*;

public class Evaluate {

    // Fill the method and return the value
    static String infixToPostfix(String expression) {
        //Do not forget to delete return "" statement
        char[] myArray = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        List<Character> list = new ArrayList<>();
        for (char c : myArray){
            if (c != '*' && c != '/' && c != '-' && c != '+' && c != '(' && c != ')'){
                list.add(c);
            }else if (stack.isEmpty()){
                stack.push(c);
            } else if (c == '*' || c == '/') {
                while (stack.peek() == '*' || stack.peek() == '/'){
                    list.add(stack.pop());
                }
                stack.push(c);
            } else if (c == '+' || c == '-') {
                while (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/'){
                       list.add(stack.pop());
                        if (stack.isEmpty()){ //I checked is it empty or not. With this way I prevented encountering the error
                            break;
                        }
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else {
                while (stack.peek() != '('){
                    list.add(stack.pop());
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        //In here I converted My List<Character> to String
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : list) {
            stringBuilder.append(character);
        }
        // Convert StringBuilder to String
        return stringBuilder.toString();
    }

    // Fill the method and return the value
    static int evaluatePostfixExpression(String expression)
    {
        //Do not forget to delete return 0 statement

        Stack<Integer> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, push it onto the stack
                stack.push(Character.getNumericValue(c));
            } else {
                // If the character is an operator, pop operands, perform operation, and push result
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
                    // Add more operators if needed
                }
            }
        }

        // The final result should be on the top of the stack
        return stack.pop();
    }

}












