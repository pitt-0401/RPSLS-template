/*
 * Created on 2026-04-04
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

import java.util.Random;
import java.util.Scanner;
import choices.*;

public class RockPaperScissorsLizardSpock {

    private static final int MIN_WINS = 2; // best of 3

    private final Player player;
    private final Player computer;

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public RockPaperScissorsLizardSpock() {
        System.out.println("Player 1, please enter your name:");
        this.player = new Player(scanner.nextLine());
        System.out.println();
        this.computer = new Player("Computer");
    }

    // NOTE: You may define additional methods to provide a better, cleaner
    // structure!

    // TODO: Implement playRound and round win check here
    private void playRound() {
        System.out.printf("%s, please enter %s, %s, %s, %s, or %s: %n", "TODO: Add the player's name", GameChoices.ROCK,
                GameChoices.PAPER,
                GameChoices.SCISSORS, GameChoices.LIZARD, GameChoices.SPOCK);
        // ...
    }

    // TODO: Implement a method to convert the player's input into a choice
    private Choice getChoice(String choice) {
        String normalizedChoice = choice.trim().toLowerCase();
        // Check the passed string and return a Choice object (i.e., Rock, Paper,
        // Scissors, Lizard, or Spock)
        // Invalid input is not a valid choice -> do not return a default Choice
        return null;
    }

    // TODO: Implement a method to get a random choice for the computer
    private Choice getRandomChoice() {
        // Based on a random number, return a Choice object (i.e., Rock, Paper,
        // Scissors, Lizard, or Spock)
        // Pick a default case
        return null;
    }

    // TODO: Implement the main game loop and overall game win check here
    // Note: A tie does not count as a win (more than 3 rounds are possible); optional: you may define a limit
    public void startGame() {

    }

    // NO NEED TO TOUCH main()
    public static void main(String[] args) {
        RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();
        game.startGame();
        game.scanner.close();
    }
}
