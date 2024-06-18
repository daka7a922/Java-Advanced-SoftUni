package _05_Functional_Programming.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _09_ListOfPredicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> divisors = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Predicate<Integer>> listOfPredicates = new ArrayList<>();

        for (Integer divisor : divisors) {

            Predicate<Integer> predicate = num -> num % divisor == 0;

            listOfPredicates.add(predicate);
        }

        for (int number = 1; number <= n; number++) {
            boolean isDivisibleByAllPredicates = true;

            for (Predicate<Integer> predicate : listOfPredicates) {
                if (!predicate.test(number)){
                    isDivisibleByAllPredicates = false;
                }
            }

            if (isDivisibleByAllPredicates){
                System.out.print(number + " ") ;
            }
        }


    }

}
