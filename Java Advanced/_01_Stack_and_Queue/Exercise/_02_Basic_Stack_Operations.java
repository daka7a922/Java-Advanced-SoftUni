package _01_Stack_and_Queue.Exercise;

import java.util.*;

public class _02_Basic_Stack_Operations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = commands[0];
        int s = commands[1];
        int x = commands[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < s ; i++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(stack.contains(x) ? true : Collections.min(stack));
        }

    }
}
