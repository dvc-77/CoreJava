package org.unit9.inheritance;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "2222-2222-222", 10000, .06);
        System.out.println("Employee information obtained");
        System.out.printf("%n%s %s%n", "First name is ", employee.getFirstName());
        System.out.printf("%n%s %s%n", "Last name is ", employee.getLastName());
        System.out.printf("%n%s %s%n", "Social security number is ", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n", "Gross sales is ", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is ", employee.getCommissionRate());

        employee.setCommissionRate(.1);
        employee.setGrossSales(5000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);

    }
}
