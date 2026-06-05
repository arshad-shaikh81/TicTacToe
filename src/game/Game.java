package game;

import model.Board;
import model.Player;
import strategy.WinningStrategy;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;
    private WinningStrategy winningStrategy;
    private int currentPlayerIndex = 0;

    public Game(Player[] players, WinningStrategy winningStrategy) {
        this.board = new Board(3);
        this.players = players;
        this.winningStrategy = winningStrategy;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Player current = players[currentPlayerIndex];
            board.printBoard();

            System.out.println(current.getName() + " turn (row col): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!board.makeMove(row, col, current.getSymbol())) {
                System.out.println("Invalid Move ❌");
                continue;
            }

            if (winningStrategy.checkWinner(board, current.getSymbol())) {
                board.printBoard();
                System.out.println(current.getName() + " WON 🎉");
                break;
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        }
        sc.close();
    }
}
