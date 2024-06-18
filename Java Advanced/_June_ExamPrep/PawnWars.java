package _June_ExamPrep;

import java.util.Scanner;

public class PawnWars {

    private static boolean gameOver = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] board = new char[8][8];

        int rowWhite = 0, colWhite = 0;
        int rowBlack = 0, colBlack = 0;

        for (int i = 0; i < 8; i++) {

            String input = scanner.nextLine();
            char[] charArr = input.toCharArray();

            board[i] = charArr;
            if (input.contains("w")) {
                colWhite = input.indexOf("w");
                rowWhite = i;
            }
            if (input.contains("b")) {
                colBlack = input.indexOf("b");
                rowBlack = i;
            }
        }

        boolean isWhiteTurn = true;

        while (!gameOver) {

            if (isWhiteTurn) {
                if (canCapture(rowWhite, colWhite, rowBlack, colBlack)) {
                    System.out.println("Game over! White capture on " + position(rowBlack, colBlack) + ".");
                    gameOver = true;
                } else {

                    board[rowWhite][colWhite] = '-';
                    rowWhite--;
                    if (rowWhite == 0) {
                        System.out.println("Game over! White pawn is promoted to a queen at " + position(rowWhite, colWhite) + ".");
                        gameOver = true;
                    } else {
                        board[rowWhite][colWhite] = 'w';
                    }

                }

            } else {
                if (canCapture(rowBlack, colBlack, rowWhite,colWhite)) {
                    System.out.println("Game over! Black capture on " + position(rowWhite, colWhite) + ".");
                    gameOver = true;
                } else {
                    board[rowBlack][colBlack] = '-';
                    rowBlack++;
                    if ((rowBlack == 7)) {
                        System.out.println("Game over! Black pawn is promoted to a queen at " + position(rowBlack, colBlack) + ".");
                        gameOver = true;
                    } else {
                        board[rowBlack][colBlack] = 'b';
                    }

                }
            }

            isWhiteTurn = !isWhiteTurn;

        }
    }

    private static String position(int row, int col) {
        return "" + (char) (col + 'a') + (8 - row);
    }

    public static boolean isValidCheck(int r, int c, char[][] board) {
        return r >= 0 && r < board.length && c >= 0 && c < board[r].length;
    }


    private static boolean canCapture(int attackerRow, int attackerCol, int targetRow, int targetCol) {

        return (attackerRow - 1 == targetRow && (attackerCol - 1 == targetCol || attackerCol + 1 == targetCol)) ||
                (attackerRow + 1 == targetRow && (attackerCol - 1 == targetCol || attackerCol + 1 == targetCol));
    }
}
