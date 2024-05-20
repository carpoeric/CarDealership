package com.pluralsight;

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
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
