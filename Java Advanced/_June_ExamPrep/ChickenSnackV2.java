package _June_ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ChickenSnackV2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> pocketMoney = new ArrayDeque<>();
        fillArrayDeque(scanner, pocketMoney::push);
        ArrayDeque<Integer> foodPrice = new ArrayDeque<>();
        fillArrayDeque(scanner, foodPrice::offer);


        int matches = 0;

        while (!pocketMoney.isEmpty() && !foodPrice.isEmpty()) {

            int money = pocketMoney.pop();
            int price = foodPrice.poll();

            if (money == price) {
                matches++;
            } else if (money > price) {
                int change = money - price;
                change += pocketMoney.pop();
                pocketMoney.push(change);
                matches++;
            }
        }

        if (matches >= 4) {

            System.out.println("Gluttony of the day! Henry ate " + matches + " foods.");
        } else if (matches == 1) {

            System.out.println("Henry ate: " + matches + " food.");

        } else if (matches > 1) {

            System.out.println("Henry ate: " + matches + " foods.");
        } else {

            System.out.println("Henry remained hungry. He will try next weekend again.");
        }


    }

    public static void fillArrayDeque(Scanner scanner, Consumer<Integer> insertion) {
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(insertion);


    }
}

