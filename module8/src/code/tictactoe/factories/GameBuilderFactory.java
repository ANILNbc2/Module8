package code.tictactoe.factories;

import code.tictactoe.exceptions.DuplicateSymbolException;
import code.tictactoe.exceptions.NotEnoughPlayersException;
import code.tictactoe.models.Game;
import code.tictactoe.models.Player;
import code.tictactoe.models.WinningStrategyName;
import code.tictactoe.strategy.winningstrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameBuilderFactory {
    private List<Player> playerList;
    private List<GameWinningStrategy> gameWinningStrategies;
    private Integer dimentions;
    private Game game;

    private GameBuilderFactory(){}

    public static GameBuilderFactory getBuilder(){
        return new GameBuilderFactory();
    }

    public Game build() throws DuplicateSymbolException, NotEnoughPlayersException {
        Set<Character> alreadyUsedCharacters  = new HashSet<>();
        for (Player player:playerList){
            if(alreadyUsedCharacters.contains(player.getSymbol().getSymbol())){
                throw new DuplicateSymbolException(player.getSymbol().getSymbol());
            }
            alreadyUsedCharacters.add(player.getSymbol().getSymbol());
        }

        if(playerList.size() == 0){
            throw new NotEnoughPlayersException("There are not enough players");
        }

        this.dimentions = playerList.size()+1;


        game = new Game(this);
        return game;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public GameBuilderFactory setDimentions(Integer dimentions){
        this.dimentions = dimentions;
        return this;
    }

    public Integer getDimentions(){
        return dimentions;
    }

    public GameBuilderFactory setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
        return this;
    }

    public GameBuilderFactory setGameWinningStrategies(
            List<WinningStrategyName> gameWinningStrategiesNames) {
        this.gameWinningStrategies = new ArrayList<>();
        for(WinningStrategyName gameWinningStrategiesName : gameWinningStrategiesNames){
            this.gameWinningStrategies.add(
                    GameWinningStrategyFactory.gameWinningStrategyByName(gameWinningStrategiesName));
        }
        return this;
    }

    public List<GameWinningStrategy> getGameWinningStrategies() {
        return gameWinningStrategies;
    }
}
