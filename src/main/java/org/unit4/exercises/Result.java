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
            out.print("Enter the result: ");
            result[pos] = input.nextInt();
            pos++;
        }

        for(int type: result){
            pass = (type == 1) ? pass += 1 : pass;
            fail = (type == 2) ? fail += 1 : fail;
        }

        out.printf("The number of students who passed are: %s %nThe number of students who failed are: %s %n", pass, fail);

        if(pass > 8)
            out.println("Bonus to instructor");

        input.close();
    }
}
