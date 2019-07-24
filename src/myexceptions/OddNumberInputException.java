package myexceptions;

public class OddNumberInputException extends Exception{
    public OddNumberInputException(){
        super("Your input number is not odd!");
    }
}