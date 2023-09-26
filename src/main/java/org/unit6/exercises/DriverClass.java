package org.unit6.exercises;

import java.security.SecureRandom;
import static java.lang.System.*;

public class DriverClass {
    public static void main(String[] args) {
        CrapsDiceGame game = new CrapsDiceGame();
        String status = game.gameStatus();

        if(status != "CONTINUE") {
            out.printf("Player has %s%n", status);
        }else {
            while (status == "CONTINUE") {
                status = game.gameStatus();
                if (status != "CONTINUE") {
                    out.printf("Player has %s%n", status);
                    break;
                }else {
                    out.printf("Player will %s%n", status);
                }
            }
        }



    }


}   
