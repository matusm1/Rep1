import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args) {
    
    Random rand = new Random();
    Scanner userInput = new Scanner(System.in);
    
    boolean win = false;
    
    int theNumber = rand.nextInt(20);
    int guess;
    int numberOfGuesses = 0;
  
  while(win == false){
      System.out.println("Guess a number between 1 and 20: ");
      guess = userInput.nextInt();
     
    if(guess == theNumber){
      System.out.println("You won!");
      win = true;
    }
    else if(guess < theNumber){
      System.out.println("My number is higher. Guess again.");
    }
    else if(guess > theNumber){
      System.out.println("My number is lower. Guess again.");
    }
    for(int i = 0; i == 10; i++) {
    if(i = 10)
    System.out.println("You lost!");
}
}
}
}
