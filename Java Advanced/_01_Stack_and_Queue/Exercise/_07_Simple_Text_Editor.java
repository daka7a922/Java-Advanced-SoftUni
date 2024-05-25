package _01_Stack_and_Queue.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _07_Simple_Text_Editor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> textHistory = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String command[] = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "1" -> {
                    textHistory.push(text.toString());
                    String textToAppend = command[1];
                    text.append(textToAppend);
                }

                case "2" -> {
                    textHistory.push(text.toString());
                    int countToBeDeleted = Integer.parseInt(command[1]);
                    int startDeletionPosition= text.length() - countToBeDeleted;
                    text.delete(startDeletionPosition,text.length());
                }

                case "3" -> {
                    int index = Integer.parseInt(command[1]);
                    System.out.println(text.charAt(index-1));

                }
                case "4" -> {
                    text = new StringBuilder(textHistory.pop());

                }

            }

        }
    }
}
