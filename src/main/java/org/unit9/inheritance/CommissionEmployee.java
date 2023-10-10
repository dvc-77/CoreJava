package org.unit9.inheritance;

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross Sales");
        }
        if (commissionRate <= 0.0 || commissionRate > 12.5) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 12.5");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross Sales");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate > 12.5) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 12.5");
        }
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return commissionRate + grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %s%n%s: %s%n", "commission employee", firstName, lastName, "social security number", socialSecurityNumber,"gross sales", grossSales, "commission rate", commissionRate);
    }
}
