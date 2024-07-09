package border_control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Identifiable> individuals = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] individualData = input.split("\\s+");

            if (individualData.length == 2) {

                String model = individualData[0];
                String id = individualData[1];
                Robot robot = new Robot(id, model);
                individuals.add(robot);

            } else {

                String name = individualData[0];
                int age = Integer.parseInt(individualData[1]);
                String id = individualData[2];
                Citizen citizen = new Citizen(name, age, id);
                individuals.add(citizen);
            }

            input = scanner.nextLine();
        }

        String idSuffix = scanner.nextLine();

        individuals.stream()
                .filter(individual -> individual.getId().endsWith(idSuffix))
                .forEach(individual -> System.out.println(individual.getId()));

    }
}
