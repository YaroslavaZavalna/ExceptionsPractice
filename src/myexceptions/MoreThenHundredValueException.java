package myexceptions;

public class MoreThenHundredValueException extends Exception {
    public MoreThenHundredValueException(){
        super("Your input number is more than 100");
    }
}