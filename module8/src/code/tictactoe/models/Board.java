package code.tictactoe.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private Integer dimentions;
    private List<List<Cell>> boardState;

    public Board(Integer dimentions){
        this.dimentions = dimentions;
        for(int i=0;i<dimentions; i++){
            this.boardState.add(new ArrayList<>());

            for(int j=0; j<dimentions;j++){
                this.boardState.get(i).add(new Cell(i,j));
            }
        }
    }

    public Integer getDimentions() {
        return dimentions;
    }

    public void setDimentions(Integer dimentions) {
        this.dimentions = dimentions;
    }

    public List<List<Cell>> getBoardState() {
        return boardState;
    }

    public void setBoardState(List<List<Cell>> boardState) {
        this.boardState = boardState;
    }
}
