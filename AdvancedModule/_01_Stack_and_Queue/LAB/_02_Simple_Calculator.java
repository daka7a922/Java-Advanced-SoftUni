package _01_Stack_and_Queue.LAB;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_Simple_Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> expression = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toCollection(ArrayDeque::new));
      //2 + 5 + 10 - 2 - 1
        while (expression.size() > 1) {
        int leftOperand = Integer.parseInt(expression.pop());
        String operation = expression.pop();
        int rightOperand = Integer.parseInt(expression.pop());

        int result = operation.equals("+") ? leftOperand + rightOperand : leftOperand - rightOperand;

        expression.push(String.valueOf(result));
        }
        System.out.println(expression.pop());
    }
}
