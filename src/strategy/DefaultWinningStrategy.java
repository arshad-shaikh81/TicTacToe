package strategy;

import model.Board;
import model.Cell;

public class DefaultWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Board board, char symbol) {
        Cell[][] cells = board.getBoard();
        int n = cells.length;

        // rows
        for (int i = 0; i < n; i++) {
            boolean win = true;
            for (int j = 0; j < n; j++) {
                if (cells[i][j].getSymbol() != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // columns
        for (int j = 0; j < n; j++) {
            boolean win = true;
            for (int i = 0; i < n; i++) {
                if (cells[i][j].getSymbol() != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // diagonals
        boolean win = true;
        for (int i = 0; i < n; i++) {
            if (cells[i][i].getSymbol() != symbol) {
                win = false;
                break;
            }
        }
        if (win) return true;

        win = true;
        for (int i = 0; i < n; i++) {
            if (cells[i][n - i - 1].getSymbol() != symbol) {
                win = false;
                break;
            }
        }
        return win;
    }
}
