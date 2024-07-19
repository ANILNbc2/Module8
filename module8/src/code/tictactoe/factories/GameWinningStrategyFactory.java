package code.tictactoe.factories;

import code.tictactoe.models.WinningStrategyName;
import code.tictactoe.strategy.winningstrategy.GameWinningStrategy;

import java.util.Objects;

public class GameWinningStrategyFactory {
    public static GameWinningStrategy
    gameWinningStrategyByName(WinningStrategyName winningStrategyName){
        GameWinningStrategy strategy = switch (winningStrategyName){
            case ROW -> null;
            case COLUMN -> null;
            case CORNER -> null;
            case DIAGONAL -> null;
        };
        return strategy;
    }
}
