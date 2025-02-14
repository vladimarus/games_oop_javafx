package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int[] ints : board) {
            if (ints[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
