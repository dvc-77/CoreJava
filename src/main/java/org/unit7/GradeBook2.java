package org.unit7;

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
            System.out.print("Student " + count);
            count++;
            for(int value: values){
                System.out.printf("\t\t\t%d", value);
            }
            System.out.println();
        }
    }

    public void testName() {
        for(int testCount = 1; testCount<= grades[0].length; testCount++){
            System.out.print("\t\t\tTest " + testCount);
        }
    }
}
