package code.tictactoe.models;

public class Cell {
    Player player;
    Integer rowNo;
    Integer columnNo;

    public Cell(Integer rowNo, Integer columnNo){
        this.rowNo = rowNo;
        this.columnNo = columnNo;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public Integer getColumnNo() {
        return columnNo;
    }

    public void setColumnNo(Integer columnNo) {
        this.columnNo = columnNo;
    }
}
