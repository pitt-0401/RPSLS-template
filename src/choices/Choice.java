/*
 * Created on 2026-04-04
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

package choices;

// TODO: Implement Choice
// Choice should function as the Base class for all the choices
// There is no default Choice!

// Rock already contains the TODOs that apply to each choice
// You may make changes to the structure and type of both classes!

public class Choice {

    // NO NEED TO TOUCH compete()
    public int compete(Choice otherPlayerChoice) {
        System.out.println("Outcome: " + competeExplanation(otherPlayerChoice));
        return determineWin(otherPlayerChoice);
    }
}
