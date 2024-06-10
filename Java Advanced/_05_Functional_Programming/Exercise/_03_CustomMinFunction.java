package _05_Functional_Programming.Exercise;

import java.util.*;
import java.util.function.Function;

public class _03_CustomMinFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                                .map(Integer::parseInt)
                                                                .toList();


        Function<List<Integer>, Integer> findMinNumberFunc = listOfNumbers -> Collections.min(listOfNumbers);


        Integer minValue = findMinNumberFunc.apply(numbers);


        System.out.println(minValue);    }
}
