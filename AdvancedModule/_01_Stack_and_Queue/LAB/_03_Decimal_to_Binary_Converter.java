package _01_Stack_and_Queue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_Decimal_to_Binary_Converter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (decimal != 0){
            stack.push(decimal % 2);
            decimal /= 2;

        }

        if (stack.isEmpty()) {
            stack.push(0);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
