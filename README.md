# Assignment 3 - Rock-Paper-Scissors-Lizard-Spock

## Learning Objectives
You will gain a deeper understanding of OOP principles, specifically: inheritance, abstract classes, and polymorphism.
You will practice how to:
- define an abstract class with abstract methods,
- override these methods in several subclasses,
- use a variable of the base class type to call a subclass's methods (polymorphism).

### Problem
**Rock-Paper-Scissors-Lizard-Spock** was invented by Sam Kass and Karen Bryla as a version of the classic selection method game Rock-Paper-Scissors that features **two** additional gestures: the **lizard** 🦎 (_hand as a sock-puppet-like mouth_) and Spock 🖖 (_Star Trek Vulcan salute_).

As Sheldon Cooper explains in *The Big Bang Theory*:
> "Scissors cuts paper, paper covers rock, rock crushes lizard, lizard poisons Spock, Spock smashes scissors, scissors decapitates lizard, lizard eats paper, paper disproves Spock, Spock vaporizes rock, and as it always has, rock crushes scissors."

### Your task
Your task is to implement this game in Java as a command-line-based game.

The code template is in the `src` folder of this repository.

## The Game

The game allows a human player to play against a computer player.

One round is played as follows:
1. The human player chooses their gesture (type of `Choice`) by typing its name, e.g., `spock` (upper or lower case does not matter).
2. The computer player chooses a random gesture (type of `Choice`)
3. The program checks for a win, loss, or tie of the round.

The game is played "best of 3", meaning that a player needs to win at least two rounds to win the game.
A tie does not count as a win, hence a game can take more than three rounds. You may define a limit on rounds (optional).

### Rules & Background
In the standard "rock-paper-scissors" gestures, each gesture defeats the one before it, and is defeated by the one after. 
If we add the two additional gestures after the word they (sort of) '_rhyme_' with, the order is determined as:
1. Rock
2. Spock
3. Paper
4. Lizard
5. Scissors

In the five-gesture version each gesture defeats **the two gestures before it** in that cyclic order (and loses to the two after it).
Hence, the following rules can be derived:
- Scissors cut paper
- Paper covers rock
- Rock crushes lizard
- Lizard poisons Spock
- Spock smashes (or melts) scissors
- Scissors decapitate lizard
- Lizard eats paper
- Paper disproves Spock
- Spock vaporizes rock
- Rock breaks scissors


### **Game Requirements - Code**
*There are TODOs in the code. Please make sure to follow them!*
* **`RockPaperScissorsLizardSpock`** represents the game.
* **`Player`** represents a player (the human or the computer) and stores the player's name and the number of rounds they have won.
* **`Choice`** is the base class for all gestures (see the TODOs in `Choice` and `Rock`).
* Create one class per gesture in the `choices` package: `Rock` (already started), `Paper`, `Scissors`, `Lizard`, and `Spock`. Each gesture is a subclass of `Choice`.
* Each choice should do the following
  * `getName()`: Return a String with the choice's name (make use of `GameChoices`!)
  * `determineWin(otherPlayerChoice)`: compares the choice with the other player's choice
    * Should return an `int`:
      * `0`: choice is equal to otherPlayerChoice
      * `1`: choice wins against otherPlayerChoice      * `-1`: choice loses to otherPlayerChoice  * `competeExplanation(otherPlayerChoice)`: should return a `String` of the game round's explanation (e.g., "Lizard poisons Spock")
* **Input Validation & Error Handling**: Make sure to add error and input validation checks!

### Polymorphism in this assignment (see L19)
`compete()` in `Choice` is already implemented: it calls `competeExplanation()` and `determineWin()`.
Which version of these methods runs depends on the **actual type of the object**, not on the type of the variable:
```java
Choice playerChoice = new Spock();   // e.g., the result of getChoice("spock")
Choice computerChoice = new Rock();  // e.g., the result of getRandomChoice()
int result = playerChoice.compete(computerChoice);
// Uses Spock's competeExplanation() and determineWin():
// prints "Outcome: Spock vaporizes Rock" and returns 1
```
Hence, `compete()` works for every gesture without knowing which one it is (the game only needs to work with `Choice`).

### Important Considerations & Hints

- Please make sure to provide expressive comments, print statements, and variable names!
- **Make sure to follow object-oriented principles!** (LSP included)
- History of the game: http://www.samkass.com/theories/RPSSL.html
- You can play the basic version of the game here: https://www.rock-paper-scissors-game.com/
- Hints:
  - Use the `instanceof` operator to check which gesture the other player chose, e.g., `if (otherPlayerChoice instanceof Lizard) { ... }`
  - Compare types, not names: `getName()` includes an emoji (e.g., `"Rock 👊"`), so comparing it to `"Rock"` does not work
  - `if-else` statements are rather cumbersome to turn the player's input or a random number into a `Choice`; think about using `switch-case` statements instead (see L19)  - You can access a nice string representation of each choice using `GameChoices`, e.g., `GameChoices.SPOCK`. Do NOT change `GameChoices`!

*Note:* The emoji representation may not work on all machines, depending on your OS' encoding.

### Extra credit challenges (*optional*)
* Add a leaderboard:
  * Store the players' names and the number of games they have won
  * Provide a way to search for a specific player
* Feel free to add your own (more complex) customization to the project!

**Happy coding!**
