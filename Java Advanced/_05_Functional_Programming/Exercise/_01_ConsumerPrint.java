package _05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class _01_ConsumerPrint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = System.out::println;

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();


        names.forEach(printer);

    }
}
