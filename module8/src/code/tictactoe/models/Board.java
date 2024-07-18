package code.tictactoe.models;

import java.util.List;

public class Board {
    private Integer dimentions;
    private List<Cell> boardState;

    public Integer getDimentions() {
        return dimentions;
    }

    public void setDimentions(Integer dimentions) {
        this.dimentions = dimentions;
    }

    public List<Cell> getBoardState() {
        return boardState;
    }

    public void setBoardState(List<Cell> boardState) {
        this.boardState = boardState;
    }
}
