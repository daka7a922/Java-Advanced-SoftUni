package _01_Stack_and_Queue.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _03_Maximum_Element {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            int command[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (command[0]){

                case 1 -> {
                    int elementX = command[1];
                    stack.push(elementX);
                }

                case 2 -> {
                    stack.pop();
                }

                case 3 -> {
                    int maxElement = Collections.max(stack);
                    System.out.println(maxElement);
                }

            }

        }
    }
}
