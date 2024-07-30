package code.tictactoe.strategy.botplayingstrategy;

import code.tictactoe.models.Board;
import code.tictactoe.models.Cell;
import code.tictactoe.models.Move;

import java.util.List;
import java.util.Objects;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Boolean checkVictory(Board board) {
        return Boolean.FALSE;
    }

    @Override
    public Move makeMove(Board board){

        for(List<Cell> row : board.getBoardState()){
            for(Cell cell: row){
                if(Objects.isNull(cell.getPlayer())){
                    return new Move(cell.getRowNo(), cell.getColumnNo(), cell.getPlayer());
                }
            }
        }
        return null;
    }

}
