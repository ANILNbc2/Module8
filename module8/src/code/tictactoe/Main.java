package code.tictactoe;

import code.tictactoe.exceptions.DuplicateSymbolException;
import code.tictactoe.exceptions.NotEnoughPlayersException;
import code.tictactoe.factories.*;
import code.tictactoe.models.*;
import code.tictactoe.strategy.winningstrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell how many human players : ");
        int numPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<>();

        System.out.println("Please tell how many Bots : ");
        int numBots = scanner.nextInt();

        for(int i=0;i<numPlayers; i++){
            System.out.println("Name of human player : ");
            String name = scanner.next();
            System.out.println("Symbol of human player : ");
            Character ch = scanner.next().charAt(0);
            Symbol symbol = new Symbol(ch);
            Player player = PlayerFactory.createHumanPlayer(name, symbol);
            players.add(player);
        }

        for(int i=0;i<numBots; i++){
            System.out.println("Name of Bot : ");
            String name = scanner.next();
            System.out.println("Symbol of Bot : ");
            Character ch = scanner.next().charAt(0);
            Symbol symbol = new Symbol(ch);
            System.out.println("Bot difficulty level : ");
            BotDifficultyLevel botDifficultyLevel =
                    BotDifficultyLevelFactory.getBotDifficultyLevelByName(scanner.next());

            Player player = PlayerFactory.createBotPlayer(name, symbol, botDifficultyLevel);
            players.add(player);

        }

        System.out.println("How many winning strategies : ");
        Integer winningStrategiesCount = scanner.nextInt();
        List<WinningStrategyName> winningStrategyNameList = new ArrayList<>();
        for(int i=0;i<winningStrategiesCount;i++){
            System.out.println("Name strategy : ");
            String name = scanner.next();
            WinningStrategyName winningStrategyName =
                    GameWinningStrategyEnumFactory.getGameWinningStrategyFromString(name);
            winningStrategyNameList.add(winningStrategyName);
        }

        try {
            Game game = GameBuilderFactory.getBuilder().
                    setGameWinningStrategies(winningStrategyNameList).
                    setPlayerList(players).
                    build();

            while (game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
                game.makeMove();
            }

        } catch (DuplicateSymbolException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughPlayersException e) {
            throw new RuntimeException(e);
        }
    }
}
