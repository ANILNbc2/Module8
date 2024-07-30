package code.tictactoe.models;

import code.tictactoe.factories.GameBuilderFactory;
import code.tictactoe.strategy.winningstrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


//Game class has a lot of attributes and many of the attributes requires validation. Hence go for builder.
public class Game {
    private List<Player> playerList;
    private List<GameWinningStrategy> gameWinningStrategies;
    private Integer lastPlayerIndex;
    private List<Player> winners;
    private List<Move> moves;
    private GameStatus gameStatus;
    private Board board;

    private Game(){
    }

    public void makeMove(){
        this.lastPlayerIndex = (this.lastPlayerIndex+1)%playerList.size();

        Move potentialMove = playerList.get(this.lastPlayerIndex).makeMove(this.board);
        if(
                Objects.nonNull(
                        this.board.getCell(potentialMove.getRow(), potentialMove.getColumn()).getPlayer())
        ){
            System.out.println("Bad move, try again");
            return;
        }

        this.moves.add(potentialMove);
        this.board.getCell(potentialMove.getRow(), potentialMove.getColumn()).setPlayer(potentialMove.getPlayer());
    }
    public Game(GameBuilderFactory builder){
        setGameStatus(GameStatus.IN_PROGRESS);
        setPlayerList(builder.getPlayerList());
        setGameWinningStrategies(builder.getGameWinningStrategies());
        setLastPlayerIndex(0);
        this.board = new Board(builder.getDimentions());
        winners = new ArrayList<>();
        moves = new ArrayList<>();
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public List<GameWinningStrategy> getGameWinningStrategies() {
        return gameWinningStrategies;
    }

    public void setGameWinningStrategies(List<GameWinningStrategy> gameWinningStrategies) {
        this.gameWinningStrategies = gameWinningStrategies;
    }

    public Integer getLastPlayerIndex() {
        return lastPlayerIndex;
    }

    public void setLastPlayerIndex(Integer lastPlayerIndex) {
        this.lastPlayerIndex = lastPlayerIndex;
    }

    public List<Player> getWinners() {
        return winners;
    }

    public void setWinners(List<Player> winners) {
        this.winners = winners;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

}
