package org.unit9.exercises;

public class CommissionCompensationModel extends CommissionEmployee{
    public CommissionCompensationModel(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }

    @Override
    public double earnings(){
        return super.getGrossSales() * super.getCommissionRate();
    }
}
