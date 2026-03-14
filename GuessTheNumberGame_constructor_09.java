package com.company;
import java.util.Random;
import java.util.Scanner;
class Game {
    private int number;
    private int userInput;
    private int noOfGuesses=0;
    // 1.Constructor to generate random number
    public Game() {
        Random rand = new Random();
        number = rand.nextInt(100)+1;
    }
    //2. Tke user input
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        userInput = sc.nextInt();
        noOfGuesses++;
    }
    //3. Check if number is correct
    public boolean isCorrectNumber() {
        if (userInput == number) {
            System.out.println("Congratulations! You guessed the number in " + noOfGuesses + " guesses.");
            return true;
        } else if (userInput < number) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        return false;
    }
    //4. Getter and Setter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}
public class GuessTheNumberGame_constructor_09 {
    public static void main(String[] args) {
        Game game = new Game();
        boolean correct = false;
        while (!correct) {
            game.takeUserInput();
            correct = game.isCorrectNumber();
    
        }
    }
}
