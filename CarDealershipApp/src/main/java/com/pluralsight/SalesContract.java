package com.pluralsight;

public class SalesContract extends Contract
{
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean finance;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, boolean finance)
    {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTax = .05*this.getVehicleSold().getPrice();
        this.recordingFee = 100;
        this.processingFee = this.getVehicleSold().getPrice()<10000 ? 295 :495;
        this.finance = finance;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public double getTotalPrice() {
        Vehicle vehicle = getVehicleSold();
        double basePrice = vehicle.getPrice();
        return basePrice + salesTax + recordingFee + processingFee;
    }


    @Override
    public double getMonthlyPayment() {
        if (!finance) {
            return 0;
        }
        double loanAmount = getTotalPrice();
        double monthlyInterestRate;
        int loanTerm;

        if (getVehicleSold().getPrice() >= 10000) {
            monthlyInterestRate = 4.25 / 100 / 12;
            loanTerm = 48;
        } else {
            monthlyInterestRate = 5.25 / 100 / 12;
            loanTerm = 24;
        }

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanTerm));
        return monthlyPayment;
    }


}
