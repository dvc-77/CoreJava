package org.unit6.exercises;

import java.security.SecureRandom;
import static java.lang.System.*;

public class DriverClass {
    public static void main(String[] args) {
        CrapsDiceGame roll1 = new CrapsDiceGame();
        CrapsDiceGame roll2 = new CrapsDiceGame();
        int firstDie = roll1.rollDie();
        int secondDie = roll2.rollDie();

        int game = firstDie + secondDie;
        String status = CrapsDiceGame.gameStatus(game);

        while (status.equals("CONTINUE")) {
            firstDie = roll1.rollDie();
            secondDie = roll2.rollDie();

            game = firstDie + secondDie;

            status = CrapsDiceGame.gameStatus(game);

            if (status.equals("CONTINUE")) {
                out.printf("Player rolled %d + %d = %d%n", firstDie, secondDie, game);
                out.printf("Player will %s%n", status);
            } else {
                out.printf("Player has %s%n", status);
                break;
            }
        }



    }


}   
