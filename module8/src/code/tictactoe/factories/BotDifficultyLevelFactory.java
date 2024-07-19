package code.tictactoe.factories;

import code.tictactoe.models.BotDifficultyLevel;

public class BotDifficultyLevelFactory {
    public static BotDifficultyLevel getBotDifficultyLevelByName(String botDifficultyLevel){
        if(botDifficultyLevel.equals("EASY"))
            return BotDifficultyLevel.EASY;
        if(botDifficultyLevel.equals("MEDIUM"))
            return BotDifficultyLevel.MEDIUM;
        if(botDifficultyLevel.equals("HARD"))
            return BotDifficultyLevel.HARD;

        return BotDifficultyLevel.EASY;
    }
}
