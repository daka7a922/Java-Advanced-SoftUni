package _June_ExamPrep;

import java.util.Scanner;

public class EscapeTheMaze {

    private static int health = 100;
    private static boolean escapedTheMaze = false;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] maze = new char[size][size];

        fillMatrix(scanner, size, maze);

        int[] playerPosition = findStartingPosition(size, maze);


        while (true) {

            if (escapedTheMaze) {
                escapedTheMaze = true;
                System.out.println("Player escaped the maze. Danger passed!");
                break;
            } else if (health <= 0) {
                health = 0;
                System.out.println("Player is dead. Maze over!");
                break;
            }

            String command = scanner.nextLine();

            movePlayer(command, playerPosition, size, maze);
            checkPosition(playerPosition, maze);


        }

        System.out.println("Player's health: "+ health +" units");
        printMaze(maze);


    }

    private static void checkPosition(int[] position, char[][] maze) {

        char currentChar = maze[position[0]][position[1]];

        switch (currentChar) {

            case 'M' -> health -= 40;

            case 'H' -> {
                health += 15;
                if (health > 100) {
                    health = 100;
                }
            }
            case 'X' -> escapedTheMaze = true;

        }

        maze[position[0]][position[1]] = 'P';

    }

    private static void movePlayer(String command, int[] position, int size, char[][] maze) {
        int row = position[0];
        int col = position[1];

        maze[row][col] = '-';

        int newRow = row;
        int newCol = col;

        switch (command) {

            case "up" -> newRow--;
            case "down" -> newRow++;
            case "right" -> newCol++;
            case "left" -> newCol--;
        }

        if (newRow >= 0 && newRow <= size-1 && newCol >= 0 && newCol <= size-1) {

            position[0] = newRow;
            position[1] = newCol;
        }


    }


    private static void fillMatrix(Scanner scanner, int size, char[][] board) {
        for (int i = 0; i < size; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }
    }

    public static int[] findStartingPosition(int size, char[][] maze) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (maze[i][j] == 'P') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void printMaze(char[][] maze) {

        for (char[] chars : maze) {

            System.out.println(chars);

        }

    }


}


//5
//-----
//-PM--
//-M---
//---H-
//-X---