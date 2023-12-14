package Hw_2_Data_Structure;

import java.util.*;

public class Evaluate {
//In my opinion firstly I should make my postfix notation with space for every operand and operators.
//With this way I will be able to make the conversion in evaluatePostfixExpression() method.
//Otherwise, I couldn't find any way to find conversion postfix to integer.


    // Fill the method and return the value
    static String infixToPostfix(String expression) {
        //Do not forget to delete return "" statement
        char[] myArray = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            int number = 0;
            if (myArray[i] != '*' && myArray[i] != '/' && myArray[i] != '-' && myArray[i] != '+' && myArray[i] != '(' && myArray[i] != ')') {
               while(myArray[i] != '*' && myArray[i] != '/' && myArray[i] != '-' && myArray[i] != '+' && myArray[i] != '(' && myArray[i] != ')'){
                   list.add(myArray[i]);
                   i++;
                   number += 1;
                   if (i == myArray.length)
                       break;
               }
               if (number == 1){
                   i--;
               }
            list.add(' ');
            } else if (stack.isEmpty()) {
                stack.push(myArray[i]);
            } else if (myArray[i] == '*' || myArray[i] == '/') {
                while (stack.peek() == '*' || stack.peek() == '/') {
                    list.add(stack.pop());

                }
                stack.push(myArray[i]);
            } else if (myArray[i] == '+' || myArray[i] == '-') {
                while (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/') {
                    list.add(stack.pop());

                    if (stack.isEmpty()) { //I checked is it empty or not. With this way I prevented encountering the error
                        break;
                    }
                }
                stack.push(myArray[i]);
            } else if (myArray[i] == '(') {
                stack.push(myArray[i]);
            } else {
                while (stack.peek() != '(') {
                    list.add(stack.pop());

                }
                stack.pop();
            }
        }
//        if (!stack.isEmpty()){
//            while (!stack.isEmpty()) {
//                list.add(stack.pop());
//                list.add(' ');
//            }
//            int lastIndex = list.size() - 1;
//            list.remove(lastIndex);
//        }

        //In here I converted My List<Character> to String
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : list) {
            stringBuilder.append(character);
        }
        // Convert StringBuilder to String
        return stringBuilder.toString();
    }

    // Fill the method and return the value
    static int evaluatePostfixExpression(String expression) {
        //Do not forget to delete return 0 statement

        Stack<Integer> stack = new Stack<>();
        char[] myArray = expression.toCharArray();
        for (int i = 0; i < myArray.length; i++) {

            if (Character.isDigit(myArray[i])) {
                // If the character is a digit, push it onto the stack
                List<Integer> list = new ArrayList<>();
                while (Character.isDigit(myArray[i])) {
                    list.add((int) myArray[i]);
                    i++;
                    if (i == myArray.length) {
                        break;
                    }
                }
                int value = 0;
                int coefficient = 10 * (list.size() - 1);
                for (Integer integer : list) {
                    value += integer * coefficient;
                    coefficient /= 10;
                }
                stack.push(value);
            } else {
                // If the character is an operator, pop operands, perform operation, and push result
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (myArray[i]) {
                    case '+' -> stack.push(operand1 + operand2);
                    case '-' -> stack.push(operand1 - operand2);
                    case '*' -> stack.push(operand1 * operand2);
                    case '/' -> stack.push(operand1 / operand2);

                    // Add more operators if needed
                }
            }
        }

        // The final result should be on the top of the stack
        return stack.pop();
    }

}












