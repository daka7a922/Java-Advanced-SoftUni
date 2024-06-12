package _05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07_FindTheSmallestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> findMinFunction = listOfNumbers -> Collections.min(listOfNumbers);


        Integer minElement = numbers.lastIndexOf(findMinFunction.apply(numbers));

        System.out.println(minElement);
    }
}
