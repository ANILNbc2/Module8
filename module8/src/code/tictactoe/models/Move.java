package code.tictactoe.models;

public class Move {
    Integer row;
    Integer column;
    Player player;

    public Move(Integer row, Integer column, Player player){
        this.row = row;
        this.column = column;
        this.player = player;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
