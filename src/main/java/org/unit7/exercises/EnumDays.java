package org.unit7.exercises;


public class EnumDays {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    Day day;
    public EnumDays(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch(day){
            case MONDAY-> System.out.println("Mondays are bad");
            case FRIDAY -> System.out.println("Fridays are better");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are best");
            default -> System.out.println("Midweek days are so-so");
        }
    }
    public static void main(String[] args) {
//        String str = "TUESDAY";
//        EnumDays test = new EnumDays(Day.valueOf(str));
//        test.dayIsLike();

        for(Day day: Day.values()) {
            System.out.print(day.toString()+": ");
            new EnumDays(day).dayIsLike();
        }

    }
}
