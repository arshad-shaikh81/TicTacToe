package strategy;

import model.Board;

public interface WinningStrategy {
    boolean checkWinner(Board board, char symbol);
}
