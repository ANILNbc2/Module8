package code.tictactoe.models;

public class Move {
    Cell cell;

    public Move(Cell cell, Player player){
        this.cell = cell;
        this.cell.setPlayer(player);
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
