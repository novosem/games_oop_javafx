package ru.job4j.puzzle;

public class Win {

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 1; i < board[row].length; i++) {
            if (board[row][i] != board[row][0]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int i = 1; i < board.length; i++) {
            if (board[i][column] != board[0][column]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1) {
                if (monoHorizontal(board, index) || monoVertical(board, index)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
