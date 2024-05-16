package com.pluralsight.models;

import ui.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class DealerShip {
    private String name;
    private String address;
    private String phone;
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public DealerShip(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
//        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }


    public static void addVehicle() {
        Scanner userInput = new Scanner(System.in);

        // vin
        System.out.println("Enter the vin: ");
        int vin = userInput.nextInt();


        //year
        System.out.println("Enter the year: ");
        int year = userInput.nextInt();


        // make
        System.out.println("Enter the make: ");
        String make = userInput.next();


        // model
        System.out.println("Enter the model: ");
        String model = userInput.next();


        // vehicle type
        System.out.println("Enter the vehicle type: ");
        String vehicleType = userInput.next();


        //color
        System.out.println("Enter the color: ");
        String color = userInput.next();


        //odometer
        System.out.println("Enter the odometer: ");
        int odometer = userInput.nextInt();


        // price
        System.out.println("Enter the price: ");
        double price = userInput.nextDouble();


        //should add the new vehicle to the array list.
        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
        vehicles.add(vehicle);
        UserInterface.displayAllVehicles();

    }

    public static void removeVehicle() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the vin: ");
        int vin = userInput.nextInt();
        try {
            DealerShip dealerShip = DealershipFileManager.getDealershipObjects();
            for (int i = 0; i < vehicles.size(); i++)

                if (vehicles.get(i).getVin() == vin) {
                    vehicles.remove(vehicles.get(i));
                }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
