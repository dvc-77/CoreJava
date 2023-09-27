package org.unit7.exercises;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int[] array = new int[5];
        int value;
        int count = 1;
        int index = 0;


        while(true) {
            out.print("Enter the numbers (between 10-100 inclusive): ");
            value = input.nextInt();
                if(value >= 10 && value <= 100) {
                    if (count < 5) {
                        array[index] = value;
                        index++;
                        count++;
                    } else {
                        break;
                    }
                } else {
                    out.println("Invalid value.");
                }
        }
        int[] duplicate = new int[array.length];

        System.arraycopy(array, 0, duplicate, 0, array.length);

        for(int step = 0; step < array.length; step++){
            int flag = 0;
            for(int innerStep = 0; innerStep < array.length; innerStep++) {
                if (array[step] == duplicate[innerStep]) {
                    flag++;
                }
            }
            if (flag > 0) {
                for(int innerStep = 0; innerStep < array.length; innerStep++) {
                    if (array[step] == duplicate[innerStep]) {
                        array[innerStep] = 0;
                    }
                }
                array[step] = 0;
            }
        }

        out.println("Here are the unique elements: ");
        for(int val : duplicate){
                out.print(val + " ");
        }




    }

}
