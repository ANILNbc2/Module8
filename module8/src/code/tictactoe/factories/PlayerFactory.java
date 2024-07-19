package code.tictactoe.factories;

import code.tictactoe.models.*;

public class PlayerFactory {
    public static Player createHumanPlayer(String name, Symbol symbol){
        Player player = new Player();
        player.setPlayerType(PlayerType.HUMAN);
        player.setName(name);
        player.setSymbol(symbol);
        return player;
    }

    public static Player createBotPlayer
            (String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel){
        Player player = new Bot(botDifficultyLevel);
        player.setName(name);
        player.setSymbol(symbol);
        return player;
    }
}
