package org.recapUnit1To7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int sum = 0;

        out.print("Enter 10 positive numbers [Press 'q' to exit]: ");
        int value = 0;
        try {
            value = input.nextInt();

            // Sentinel-controlled loop:: Buggy because it is isnt ideal, you'd have to manually count you number of inputs and ensure you enter just that
            while (true) {
               if (value < 0) {
                    out.print("Enter only positive values again: ");
                    value = input.nextInt();
               } else {
                    sum += value;
                    out.print("Enter 10 positive numbers [Press 'q' to exit]: ");
                    value = input.nextInt();
               }

            }

        } catch(InputMismatchException e){
                out.println();
        }

        out.println("The sum of the numbers are: " + sum);

        int count = 0;
        int value2 = 0;
        while(count < 7) {
            out.print("Enter the values: ");
            value2 += input.nextInt();
            count++;
        }
        double average = 0;
        count = 7;
        average = (double) value2 / count;

        out.println("The average for the input is: " + average);

        out.print("Enter values to be processed: ");
        int firstInput = input.nextInt();
        int temp = firstInput;
        int[] values = new int[temp];
        values[0] = temp;
       for(int iter = 1; iter < values.length; iter++) {
           out.print("Enter values to be processed: ");
           values[iter + 1] = input.nextInt();
       }

        Arrays.sort(values);

       out.println("The largest numbers is: " + values[values.length-1]);

    }
}
