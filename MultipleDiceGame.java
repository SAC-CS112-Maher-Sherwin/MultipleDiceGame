package multipledicegame;
import java.util.Scanner;

public class MultipleDiceGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ComputerRoll r = new ComputerRoll();
        UserGuess u = new UserGuess();
       
        System.out.println("Welcome! Let's play a Dice Game.");
          
    // Prompt user to enter how many dice they want to roll.

        System.out.print("How many dice do you want to roll? ");
            int numberOfDice = r.setNumberOfDice();
            
    // Prompt user to guess the amount of points they will roll
    
        System.out.printf("\nOkay! You're about to roll %d dice. \nCan you guess how many points "
                + "you will roll in total? ", numberOfDice);
        int userGuess = u.setUserGuess(numberOfDice);
            
    // Roll the dice, display rolls, and compare total with user's guess
    
        int diceRoll = r.getRoll(numberOfDice);
        u.compareGuessAndRoll(userGuess, diceRoll);
        u.displayResults();
    
    }    
        
}
   