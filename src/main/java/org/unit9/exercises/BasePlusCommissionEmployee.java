package org.unit9.exercises;

public class BasePlusCommissionEmployee {

    // Composition exercise
    CommissionEmployee employee = new CommissionEmployee("John", "Doe","222-22-222", 20000, .6);
    private double baseSalary;
    public BasePlusCommissionEmployee (double baseSalary) {
        if(baseSalary < 0.0){
          throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double earnings(){
        return baseSalary + (employee.getCommissionRate() * employee.getGrossSales());
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f%n", "base-salaried commission employee", employee, "base salary", baseSalary);
    }

}
