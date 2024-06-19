package _June_ExamPrep;

import java.util.Scanner;

public class ClearSkies {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int jetRow = 0, jetCol = 0;

        char[][] airspace = new char[n][n];

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            char[] currentRow = input.toCharArray();
            airspace[i] = currentRow;

            if (input.contains("J")) {
                jetCol = input.indexOf("J");
                jetRow = i;
            }

        }

        int jetArmor = 300;
        int enemyPlanes = 4;

        boolean missionFailed = false;
        boolean missionAccomplished = false;

        while (!missionAccomplished && !missionFailed) {

            String command = scanner.nextLine();
            int newRow = jetRow;
            int newCol = jetCol;

            switch (command) {

                case "up" -> newRow--;
                case "down" -> newRow++;
                case "right" -> newCol++;
                case "left" -> newCol--;

            }

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {

                char targetCell = airspace[newRow][newCol];

                switch (targetCell) {

                    case '-' -> {
                        break;
                    }

                    case 'E' -> {

                        airspace[newRow][newCol] = '-';
                        jetArmor -= 100;
                        enemyPlanes--;

                        if (jetArmor <= 0) {
                            missionFailed = true;
                            System.out.println("Mission failed, your jetfighter was shot down! Last coordinates [" + newRow + ", " + newCol + "]!");

                        } else if (enemyPlanes == 0) {
                            missionAccomplished = true;
                            System.out.println("Mission accomplished, you neutralized the aerial threat!");
                        }
                    }

                    case 'R' -> {
                        airspace[newRow][newCol] = '-';
                        jetArmor = 300;

                    }
                }


                airspace[jetRow][jetCol] = '-';
                jetRow = newRow;
                jetCol = newCol;
                airspace[jetRow][jetCol] = 'J';


                if (missionFailed || missionAccomplished)
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(airspace[i][j]);
                        }
                        System.out.println();
                    }

            }


        }


    }
}
