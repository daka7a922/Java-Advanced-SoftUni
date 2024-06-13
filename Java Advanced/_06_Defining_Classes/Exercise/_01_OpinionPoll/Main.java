package _06_Defining_Classes.Exercise._01_OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while(n-- > 0){

            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            people.add(person);


        }

        people = people.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        people.sort(Comparator.comparing(person -> person.getName()));

        // 1.
        for (Person person : people) {
            System.out.println(person.toString());
        }

        //2. Func way
       // people.forEach(person -> System.out.println(person.toString()));



    }
}
