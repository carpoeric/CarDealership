package com.pluralsight.models;

import java.io.*;
import java.util.Scanner;

import static com.pluralsight.models.DealerShip.vehicles;

public class DealershipFileManager {

    public static DealerShip getDealershipObjects() {
        //file reader

        try (FileReader file = new FileReader("files/inventory.csv")) {
            Scanner fileScanner = new Scanner(file);
            String line = fileScanner.nextLine();
            String[] parts = line.split("\\|");
            //get dealership first
            DealerShip dealership = new DealerShip(parts[0], parts[1], parts[2]);
            //get list of vehicles to put into dealership
            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine();
                String[] vehicleParts = line.split("\\|");
                int vin = Integer.parseInt(vehicleParts[0]);
                int year = Integer.parseInt(vehicleParts[1]);
                int odometer = Integer.parseInt(vehicleParts[6]);
                double price = Double.parseDouble(vehicleParts[7]);
                Vehicle vehicle = new Vehicle(vin, year, vehicleParts[2], vehicleParts[3], vehicleParts[4], vehicleParts[5], odometer, price);
                vehicles.add(vehicle);

            }
            return dealership;
        } catch (IOException e) {
        }
        return null;
    }

}
