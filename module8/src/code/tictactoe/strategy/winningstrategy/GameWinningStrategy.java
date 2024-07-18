package code.tictactoe.strategy.winningstrategy;

import code.tictactoe.models.Board;

public interface GameWinningStrategy {
    boolean checkVictoory(Board board);
}
