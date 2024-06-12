package _05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_AppliedArithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                                .map(Integer::parseInt)
                                                                .collect(Collectors.toList());

        String command = scanner.nextLine();

        Function<List<Integer>, List<Integer>> addFunction = listOfNumbers ->listOfNumbers.stream()
                                                                                                .map(number -> number + 1)
                                                                                                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> multiplyFunction = listOfNumbers ->listOfNumbers.stream().map(number -> number * 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtractFunction = listOfNumbers ->listOfNumbers.stream().map(number -> number - 1).collect(Collectors.toList());
       // Consumer<List<Integer>> printer = listOfNumbers -> listOfNumbers.forEach(number -> System.out.print(number + " "));

        while (!command.equals("end")){

            switch (command) {
                case "add" -> numbers = addFunction.apply(numbers);

                case "multiply" -> numbers = multiplyFunction.apply(numbers) ;

                case "subtract" -> numbers = subtractFunction.apply(numbers);

                case "print" -> {numbers.forEach(number -> System.out.print(number + " "));
                    System.out.println();
                }

            }
            command = scanner.nextLine();
        }
    }
}
