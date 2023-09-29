package org.unit7;

import java.util.Formatter;

public class GradeBook2 {
    private int[][] grades;
    private String courseName;

    private double average;

    public GradeBook2( int[][] grades) {
        this.grades = grades;
    }

    public void output(){
        int count = 1;
        for(int[] values: grades){
            System.out.printf("Student %02d |", count);
            count++;
            for(int value: values){
                System.out.printf("%7d", value);
            }
            System.out.println();
        }
    }

    public void testName() {
        Formatter fmt = new Formatter();
        for(int testCount = 1;  testCount<= grades[0].length; testCount++){
            String content = "Test";
            System.out.printf("%6s %d", content, testCount);
        }
    }
}
