package _05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _06_PredicateForNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int desiredLength = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> predicate = name -> name.length() <= desiredLength;

        names.stream()
                .filter(predicate)
                .forEach(name -> System.out.println(name));

    }
}
