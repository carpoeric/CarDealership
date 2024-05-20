package com.pluralsight.Models;

public class LeaseContract extends Contract
{
    private double expectedEndingValue;
    private double leaseFee;


    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold)
    {
        super(date, customerName, customerEmail, vehicleSold);
        this.expectedEndingValue = this.getVehicleSold().getPrice()/2;
        this.leaseFee = .07*this.getVehicleSold().getPrice();
    }


    public double getExpectedEndingValue()
    {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue)
    {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee()
    {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee)
    {
        this.leaseFee = leaseFee;
    }
    @Override
    public double getTotalPrice() {
        return this.expectedEndingValue + this.leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        double principal = getVehicleSold().getPrice() - this.expectedEndingValue;
        double monthlyInterestRate = 0.04 / 12; // Annual rate divided by 12 months
        int totalPayments = 36; // 3 years * 12 months
        double monthlyPayment = (monthlyInterestRate * principal) /
                (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));
        return monthlyPayment;
    }

}
