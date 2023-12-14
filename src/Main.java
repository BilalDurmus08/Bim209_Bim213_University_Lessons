import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String a = "20*56-9/4";
        convert(a);
    }

    public static void convert(String expression) {
        char[] myArray = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < myArray.length; i++) {

            List<Character> list = new ArrayList<>();
            if (myArray[i] != '*' && myArray[i] != '/' && myArray[i] != '-' && myArray[i] != '+' && myArray[i] != '(' && myArray[i] != ')') {
                int k = 1;
                int a = 1;
                List<Integer> myList = new ArrayList<>();
                while (myArray[i] != '*' && myArray[i] != '/' && myArray[i] != '-' && myArray[i] != '+' && myArray[i] != '(' && myArray[i] != ')') {
                    myList.add((int) myArray[i]);
                    if (a != 1) {
                        k *= 10;
                        i++;
                    }
                    a++;
                }
                int value = 0;
                for (Integer integer : myList) {
                    value = value + (integer * k);
                    k = k / 10;
                }
                list.add((char) value);
                list.add(' ');

            }
        }
    }
}
