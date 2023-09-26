package org.unit6.exercises;

import java.security.SecureRandom;

import static java.lang.System.out;

public class CrapsDiceGame {
    enum Status {
        CONTINUE,
        WON,
        LOST
    };
    private final int SNAKE_EYES = 2;
    private final int TREY = 3;
    private final int SEVEN = 7;
    private final int YO_LEVEN = 11;
    private final int BOX_CARS = 12;


    public int rollDie() {
        SecureRandom rollDie = new SecureRandom();

        int firstDie = rollDie.nextInt(6) + 1;
        int secondDie = rollDie.nextInt(6) + 1;

        int roll = firstDie + secondDie;

        out.printf("Player rolled %d + %d = %d%n", firstDie, secondDie, roll);

        return roll;
    }

    private int roll = rollDie();
    public String gameStatus(){
        String result = "";
        switch(roll) {
            case SEVEN, YO_LEVEN, BOX_CARS -> {
                result = String.valueOf(Status.WON);
            }
            case TREY, SNAKE_EYES -> {
                result = String.valueOf(Status.LOST);
            }
            default -> {
                result = String.valueOf(Status.CONTINUE);
            }
        }
        return result;
    }




}
