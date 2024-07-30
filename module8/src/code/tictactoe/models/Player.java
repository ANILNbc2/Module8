package code.tictactoe.models;

import java.util.Scanner;

public class Player {
    Symbol symbol;
    String name;
    PlayerType playerType;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What row : ? ");
        Integer row = scanner.nextInt();

        System.out.println("What Column : ? ");
        Integer column = scanner.nextInt();

        Move move = new Move(row, column, this);

        return move;
    }
}
