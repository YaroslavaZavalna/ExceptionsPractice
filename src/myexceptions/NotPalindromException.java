package myexceptions;

public class NotPalindromException extends Exception{
    public NotPalindromException(){
        super("Your input word is not palindrom!");
    }
}