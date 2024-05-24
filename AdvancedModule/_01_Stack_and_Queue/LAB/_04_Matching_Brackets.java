package _01_Stack_and_Queue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _04_Matching_Brackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();

        for (int index = 0; index < expression.length(); index++) {

            char ch = expression.charAt(index);
            if (ch == '('){
                stack.push(index);

            }else if (ch == ')') {
                int startIndex = stack.pop();

                String subexpression = expression.substring(startIndex, index + 1);

                System.out.println(subexpression);

            }
        }
    }
}
