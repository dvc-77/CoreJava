package org.unit8;

public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++count;

        System.out.printf("Employee constructor: %s %s :: index: %d", firstName, lastName, count);
    }

    public static int getCount(){
        return count;
    }


    public static void main(String[] args) {
        Employee person = new Employee("Neil", "Ohene");
        person.getCount();
//        Employee.getCount();
    }
}
