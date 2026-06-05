package model;

public class Board {
    private Cell[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (board[row][col].isEmpty()) {
            board[row][col].setSymbol(symbol);
            return true;
        }
        return false;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (Cell[] row : board) {
            for (Cell cell : row) {
                System.out.print(cell.getSymbol() + " ");
            }
            System.out.println();
        }
    }
}
