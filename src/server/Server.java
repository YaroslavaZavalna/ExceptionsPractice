package server;

import myexceptions.MoreThenHundredValueException;
import myexceptions.NotPalindromException;
import myexceptions.OddNumberInputException;

import java.util.Scanner;

public class Server {

    public Server(){
        enterValues();
    }

    private void enterValues(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        Integer number = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your word: ");
        String word = sc.nextLine();
        System.out.print("Enter one more word: ");
        String word2 = sc.nextLine();
        checkOfAllInput(word, number,word2);
    }

    private void checkOfAllInput(String str, int number, Object object){
        try {
            wordInputCheck(str);
            numberInputCheck(number);
            objectCheck(object);
        } catch (NotPalindromException | MoreThenHundredValueException | OddNumberInputException | NullPointerException e1) {
            e1.printStackTrace();
        }
    }
    private void objectCheck(Object o) throws NullPointerException{
        if(o==null){
            throw new NullPointerException();
        }else{
            System.out.println("Input object is not null!");
        }
    }
    private void numberInputCheck(Integer number) throws MoreThenHundredValueException, OddNumberInputException, StackOverflowError{
        if(number%2!=0){
            throw new OddNumberInputException();
        }else if(number>100){
            throw new MoreThenHundredValueException();
        }else{
            System.out.println("Your number is even and less than 100!");
        }
    }
    private void wordInputCheck(String str) throws NotPalindromException {
        if(str.equals(new StringBuffer(str).reverse().toString())){
            System.out.println("Input word is palindrom!");
        }else{
            throw new NotPalindromException();
        }
    }
}