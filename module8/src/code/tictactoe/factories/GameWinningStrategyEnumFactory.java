package code.tictactoe.factories;

import code.tictactoe.models.WinningStrategyName;

public class GameWinningStrategyEnumFactory {

    public static WinningStrategyName getGameWinningStrategyFromString(String name){
        if(name.equals("ROW"))
            return WinningStrategyName.ROW;
        if(name.equals("COLUMN"))
            return WinningStrategyName.COLUMN;
        if(name.equals("DIAGONAL"))
            return WinningStrategyName.DIAGONAL;
        if(name.equals("CORNER"))
            return WinningStrategyName.CORNER;
        return WinningStrategyName.ROW;
    }
}
