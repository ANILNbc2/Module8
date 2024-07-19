package code.tictactoe.strategy.winningstrategy;

import code.tictactoe.models.Board;

public interface GameWinningStrategy {
    boolean checkVictory(Board board);
}
