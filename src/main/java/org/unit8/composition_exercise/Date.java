package org.unit8.composition_exercise;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("Month must be 1-12");
        }else if (day != 29 && month != 2 && !(year % 4 == 0)){
            if(day <= 0 || (day > daysPerMonth[month-1])) {
                throw new IllegalArgumentException("Day must be 1-31");
            }
        }else if (year < 0) {
            throw new IllegalArgumentException("Year must be greater than 0");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %02d/%02d/%d%n", month, day, year);
    }

    public String toString() {
        return String.format("%02d/%02d/%d", month, day, year);
    }


}
