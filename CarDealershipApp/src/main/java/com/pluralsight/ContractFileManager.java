package com.pluralsight;

import java.io.*;

public class ContractFileManager
{

    public Dealership getContract()
    {


        try (BufferedReader reader = new BufferedReader(new FileReader( "Contracts.csv")))
        {

            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] tokens = line.split("\\|");
                if(lineCounter<=1)
                {
                  String date
                  String customerName
                  String customerEmail

                }
                else
                {
                    int vin = Integer.parseInt(tokens[0]);
                    int year = Integer.parseInt(tokens[1]);
                    String make = tokens[2];
                    String model = tokens[3];
                    String vehicleType = tokens[4];
                    String color = tokens[5];
                    int odometer = Integer.parseInt(tokens[6]);
                    double price = Double.parseDouble(tokens[7]);

                    Vehicle vehicle = new Vehicle(vin,year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);

                }
                lineCounter++;
            }

        }
        catch (IOException e)
        {
            System.err.print(e);
        }

        return dealership;
    }

    public void saveContract(Contract contract)
    {
        String dealershipName= String.format("%1s|%1s|%1s", contract.getName(),contract.getAddress(),contract.getPhone());
        try
        {
            BufferedWriter nameWriter = new BufferedWriter(new FileWriter("inventory.csv"));
            nameWriter.write(dealershipName+"\n");
            nameWriter.close();
            try
            {
                BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.csv",true));
                for(Vehicle vehicle:contract.getAllVehicles())
                {
                    String vehicleFormat = vehicle.getVin()+"|"+vehicle.getYear()+"|"+vehicle.getMake()+"|"+vehicle.getModel()+"|"+vehicle.getVehicleType()+"|"+vehicle.getColor()+"|"+vehicle.getOdometer()+"|"+vehicle.getPrice()+"\n";
                    writer.write(vehicleFormat);
                }
                writer.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }

        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}

// public ArrayList<Contract> loadContract()
//{
// ArrayList<Contract> contractList = new ArrayList<>();
// ---- Buffered reader?
//}