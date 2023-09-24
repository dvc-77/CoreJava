package org.unit4;

import java.util.Scanner;
import static java.lang.System.*;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        double marks = 0.0;
        double average = 0.0;

        Student student = new Student("Albert", 83);

        out.printf("The current grade letter %s of is %s %n", student.getName(), student.getLetterGrade());

        out.print("Please enter the marks of student: ");

        for(int count = 0; count < 10; count++){
            marks += input.nextDouble();
        }

        average = student.determineAverage(marks, 10);

        student.setAverage(average);

        out.printf("The grade letter of the student now is: %s", student.getLetterGrade());

    }
}
