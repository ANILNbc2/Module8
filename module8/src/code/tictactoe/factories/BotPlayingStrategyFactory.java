package code.tictactoe.factories;

import code.tictactoe.models.BotDifficultyLevel;
import code.tictactoe.strategy.botplayingstrategy.BotPlayingStrategy;
import code.tictactoe.strategy.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(
            BotDifficultyLevel botDifficultyLevel
    ){
        return switch (botDifficultyLevel){
            case EASY -> null;
            case MEDIUM -> new RandomBotPlayingStrategy();
            case HARD -> new RandomBotPlayingStrategy();
        };
    }
}
