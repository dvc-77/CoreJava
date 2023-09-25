package org.unit4.exercises;

import java.util.Scanner;

import static java.lang.System.*;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int pos = 0;
        int pass = 0;
        int fail = 0;
        int[] result = new int[10];

        while(pos < 10){
            out.print("Enter the result (1 = pass, 2 = fail): ");
            result[pos] = input.nextInt();
            pos++;
        }

        for(int type: result){
            pass = (type == 1) ? pass += 1 : pass;
            fail = (type == 2) ? fail += 1 : fail;
        }

        out.printf("\t\t\tPassed: %s %n\t\t\t Failed: %s %n", pass, fail);

        if(pass > 8)
            out.println("Bonus to instructor");

        input.close();
    }
}
