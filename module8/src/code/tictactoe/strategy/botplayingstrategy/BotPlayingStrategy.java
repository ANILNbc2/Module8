package code.tictactoe.strategy.botplayingstrategy;

import code.tictactoe.models.Board;
import code.tictactoe.models.Move;

public interface BotPlayingStrategy {
    public Boolean checkVictory(Board board);
    public Move makeMove(Board board);
}
