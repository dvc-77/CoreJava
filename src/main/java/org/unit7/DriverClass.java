package org.unit7;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
public class DriverClass {
    // Tenagram
    public static void main(String[] args) {
        /*
            One-dimensional Array
         */

        int[][] gradesArray = {
                {87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}
        };
        GradeBook2 gradeBook2 = new GradeBook2(gradesArray);
        out.print("\t\t\t");
        gradeBook2.testName();
        out.println();
        gradeBook2.output();
    }
}
