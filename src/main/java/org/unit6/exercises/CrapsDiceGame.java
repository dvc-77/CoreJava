package org.unit6.exercises;

import java.security.SecureRandom;

import static java.lang.System.out;

public class CrapsDiceGame {
    enum Status {
        CONTINUE,
        WON,
        LOST
    };
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    public int rollDie() {
        SecureRandom rollDie = new SecureRandom();

        int firstDie = rollDie.nextInt(6) + 1;
        int secondDie = rollDie.nextInt(6) + 1;
        int sum = firstDie + secondDie;

        out.printf("Player rolled %d + %d = %d%n", firstDie, secondDie, sum);

        return sum;
    }


    public static String gameStatus(int value){
        String result = "";
        switch(value) {
            case SEVEN, YO_LEVEN, BOX_CARS -> {
                result = Status.WON.toString();
            }
            case TREY, SNAKE_EYES -> {
                result = Status.LOST.toString();
            }
            default -> {
                result = Status.CONTINUE.toString();
            }
        }
        return result;
    }




}
