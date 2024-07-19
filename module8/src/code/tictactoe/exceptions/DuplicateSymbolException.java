package code.tictactoe.exceptions;

public class DuplicateSymbolException extends Exception{

    public DuplicateSymbolException(Character character){
        System.out.println("Symbol " + character + " is repeated twice");
    }

}
