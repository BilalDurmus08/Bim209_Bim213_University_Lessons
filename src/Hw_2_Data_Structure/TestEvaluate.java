package Hw_2_Data_Structure;

import java.util.Scanner;

public class TestEvaluate {
    //Do not change main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Give the expression: ");
        String exp = input.nextLine(); // ex : "20+2*3+(2*8+5)*4";


        String postFixExp = Evaluate.infixToPostfix(exp);
        System.out.println(postFixExp);

//        int result = Evaluate.evaluatePostfixExpression(postFixExp);
//        System.out.println(result);
    }
}
