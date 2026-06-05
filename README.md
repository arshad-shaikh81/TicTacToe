# Tic Tac Toe — Java

A console-based Tic Tac Toe game built in Java, structured using the **Strategy design pattern** to keep player behavior modular and extensible.

---

## Features

- Two-player mode (Human vs Human)
- Clean console UI with a 3×3 board
- Win, loss, and draw detection
- Strategy pattern — player behavior is interchangeable without changing core game logic

---

## Design Pattern

### Strategy Pattern
Each player's move behavior is defined as a strategy interface. This makes it easy to swap or extend player types (e.g. human input, AI, random bot) without modifying the game engine.

```
PlayerStrategy (interface)
    └── HumanPlayer
```

---

## Project Structure

```
src/
└── game/
    ├── Main.java               # Entry point — run this
    ├── Board.java              # Game board logic
    ├── Game.java               # Game loop and flow control
    ├── Player.java             # Player model
    ├── strategy/
    │   ├── PlayerStrategy.java # Strategy interface
    │   └── HumanPlayer.java    # Human input implementation
```

---

## Getting Started

### Prerequisites
- Java 8 or higher
- Any IDE (IntelliJ, Eclipse) or terminal with `javac`

### Run from terminal

```bash
# Clone the repository
git clone https://github.com/your-username/tictactoe.git
cd tictactoe

# Compile
javac -d out src/game/*.java src/game/strategy/*.java

# Run
java -cp out game.Main
```

### Run from IDE
Open the project, navigate to `src/game/Main.java`, and click **Run**.

---

## How to Play

1. The game starts and asks each player to enter their name.
2. Players take turns entering a position (1–9) corresponding to the board:

```
 1 | 2 | 3
-----------
 4 | 5 | 6
-----------
 7 | 8 | 9
```

3. First player to get 3 in a row (horizontal, vertical, or diagonal) wins.
4. If all 9 cells are filled with no winner, the game ends in a draw.

---

## Author

**Shaikh Arshad** — Undergraduate Student & Backend Developer

- GitHub: https://github.com/arshad-shaikh81
- LinkedIn: https://www.linkedin.com/in/arshad-shaikh-990878365/
