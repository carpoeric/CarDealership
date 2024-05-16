package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DealerShipTest {
    
@Test
public void should_Add_A_Vehicle_To_Csv_File(){
//    // arrange
//    DealerShip dealerShip = new DealerShip();
//    // act
//    Scanner userInput = new Scanner(System.in);
//    try{
//        Vehicle newVehicle = new Vehicle();
//        dealerShip = DealershipFileManager.getDealershipObjects();
//        for (Vehicle vehicle: dealerShip.vehicles) {
//            // vin
//            System.out.println("Enter the vin: ");
//            int vin = userInput.nextInt(22222);
//            newVehicle.setVin(vin);
//
//            //year
//            System.out.println("Enter the year: ");
//            int year = userInput.nextInt(1994);
//            newVehicle.setYear(year);
//
//            // make
//            System.out.println("Enter the make: ");
//            String make = userInput.next("Ford");
//            newVehicle.setMake(make);
//
//            // model
//            System.out.println("Enter the model: ");
//            String model = userInput.next("Ranger");
//            newVehicle.setModel(model);
//
//            // vehicle type
//            System.out.println("Enter the vehicle type: ");
//            String vehicleType = userInput.next("truck");
//            newVehicle.setVehicleType(vehicleType);
//
//            //color
//            System.out.println("Enter the color: ");
//            String color = userInput.next("red");
//            newVehicle.setColor(color);
//
//            //odometer
//            System.out.println("Enter the odometer: ");
//            int odometer = userInput.nextInt(123456);
//            newVehicle.setOdometer(odometer);
//
//            // price
//            System.out.println("Enter the price: ");
//            double price = userInput.nextDouble();
//            newVehicle.setPrice(price);
//
//            //should add the new vehicle to the array list.
//            dealerShip.addVehicle(newVehicle);
//        }
//
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    }

    // assert
    // assertArrayEquals(dealerShip.addVehicle(), "Because the vehicle has been added to the array");

}
@Test
public void should_Remove_A_Vehicle_On_The_Csv_File(){
    // arrange
    DealerShip dealerShip = new DealerShip("Joe's", "445 Larkin st ", "510-666-9090");
    Vehicle vehicle = new Vehicle(22222, 1994,"Ford","Ranger","truck","red", 123456,1900 );
    // act


    // assert

}
}