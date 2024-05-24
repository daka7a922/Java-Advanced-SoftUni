package _01_Stack_and_Queue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_Printer_Queue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")){

            if (input.equals("cancel")){

                if (printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled "+printerQueue.pollFirst());
                }

            } else {
                printerQueue.offer(input);
            }

            input = scanner.nextLine();
        }

        if (!printerQueue.isEmpty()){
            for (String task : printerQueue) {
                System.out.println(printerQueue.poll());
            }
        }
    }
}
