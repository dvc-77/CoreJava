package org.unit7;
import static java.lang.System.out;
public class DriverClass {
    // Tenagram
    public static void main(String[] args) {
        int[] grades  = {87, 92, 52, 80, 77};
        GradeBook gradeBook = new GradeBook(grades);

        out.println("The grades are:\n");

        gradeBook.output();

        out.printf("Class average is %.2f%n", gradeBook.gradeAverage(grades));


    }


}
