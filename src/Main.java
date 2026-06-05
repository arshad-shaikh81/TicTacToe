import game.Game;
import model.Player;
import strategy.DefaultWinningStrategy;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Player1", 'X');
        Player p2 = new Player("Player2", 'O');

        Game game = new Game(
                new Player[] { p1, p2 },
                new DefaultWinningStrategy());

        game.start();
    }
}
