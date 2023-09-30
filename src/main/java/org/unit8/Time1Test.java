package org.unit8;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        try {
            time.setTime(22, 52, 23);
        } catch (Exception e) {
            System.out.println(String.format("Exception: %s", e));
            System.exit(0);
        }
        System.out.println(time.toUniversalString());
//
        System.out.println(time);
        System.out.println(time.displayTime());
    }
}
