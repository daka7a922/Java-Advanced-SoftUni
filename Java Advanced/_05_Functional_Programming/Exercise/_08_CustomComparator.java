package _05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_CustomComparator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                                .map(Integer::parseInt)
                                                                .collect(Collectors.toList());


        Comparator<Integer> comparator = (first, second) -> {


            if (first % 2 != 0 && second % 2 == 0 ){
                return 1;
            }

            if (first % 2 == 0 && second % 2 != 0){
                return -1;
            }

            return first.compareTo(second);
        };

        numbers.stream()
                .sorted(comparator)
                .forEach(number -> System.out.print(number + " "));
    }
}
