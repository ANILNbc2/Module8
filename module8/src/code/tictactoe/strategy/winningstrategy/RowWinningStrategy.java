package code.tictactoe.strategy.winningstrategy;

import code.tictactoe.models.Board;

public class RowWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkVictory(Board board) {
        return false;
    }
}
