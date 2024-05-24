package _01_Stack_and_Queue.LAB;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_Hot_Potato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // ArrayDeque<String> queue = new ArrayDeque<>();

        ArrayDeque<String> queue = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());

        while(queue.size() > 1){

            for (int i = 0; i < n-1; i++) {
                String currentChild= queue.poll();

                queue.offer(currentChild);
            }

            String childToRemove = queue.poll();
            System.out.println("Removed "+ childToRemove);
        }
        System.out.println("Last is " + queue.peek());


    }
}
