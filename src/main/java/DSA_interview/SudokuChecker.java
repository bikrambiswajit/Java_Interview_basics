package DSA_interview;

import java.util.HashSet;

public class SudokuChecker {
    public static boolean isValidSudoku(int[][] board) {
        int n = board.length;

        // Check rows
        for (int i = 0; i < n; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (!rowSet.add(board[i][j])) {
                    return false;
                }
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            HashSet<Integer> colSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (!colSet.add(board[i][j])) {
                    return false;
                }
            }
        }

        // Check 3x3 subgrids
        int subgridSize = (int) Math.sqrt(n);
        for (int i = 0; i < n; i += subgridSize) {
            for (int j = 0; j < n; j += subgridSize) {
                HashSet<Integer> subgridSet = new HashSet<>();
                for (int k = i; k < i + subgridSize; k++) {
                    for (int l = j; l < j + subgridSize; l++) {
                        if (!subgridSet.add(board[k][l])) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 9, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 7, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 5, 0, 0, 3}
        };

        if (isValidSudoku(board)) {
            System.out.println("The Sudoku puzzle is valid.");
        } else {
            System.out.println("The Sudoku puzzle is invalid.");
        }
    }
}