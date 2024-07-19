package code.tictactoe.exceptions;

public class NotEnoughPlayersException extends Exception{
    public NotEnoughPlayersException(String message){
        System.out.println(message);
    }
}
