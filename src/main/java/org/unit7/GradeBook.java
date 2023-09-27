package org.unit7;

public class GradeBook {
    private int[] grades;

    public GradeBook(int[] grades){
        this.grades = grades;
    }

    public void output(){
        int count = 1;
        for(int value: grades){
            System.out.printf("Student %d: %d%n",count, value);
            count++;
        }
    }

    public double gradeAverage(int[] grades){
        double average = 0.0;
        for(int value: grades){
            average += value;
        }
        average /= grades.length;
        return average;
    }
}
