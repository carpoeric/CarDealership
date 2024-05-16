package ui;

import com.pluralsight.models.DealerShip;
import com.pluralsight.models.DealershipFileManager;
import com.pluralsight.models.Vehicle;

import java.util.Scanner;

import static com.pluralsight.models.DealerShip.vehicles;

public class UserInterface {
    public void MainScreen(){
        //Main screen for all options
        Scanner UserInput = new Scanner(System.in);
        while (true){
            try{
                System.out.println("-------Car Dealership main Screen-------");
                System.out.println("Please choose a option with the following buttons:");
                System.out.println("-".repeat(35));
                System.out.println("1) Find vehicles within a price range");
                System.out.println("2) Find vehicles by make/model");
                System.out.println("3) Find vehicles by year range.");
                System.out.println("4) Find vehicles by color");
                System.out.println("5) Find vehicles by mileage range");
                System.out.println("6) Find vehicles by type (car,truck,suv,van,etc).");
                System.out.println("7) List All vehicles.");
                System.out.println("8) Add a vehicle");
                System.out.println("9) Remove a vehicle");
                System.out.println("99) Quit");
                System.out.println("-".repeat(35));
                System.out.println();
                System.out.print("Type your option here: ");
                int choice = UserInput.nextInt();

                switch (choice){
                    case 1:
                        // Find vehicles within a price range
                        break;
                    case 2:
                        //Find vehicles by make/model
                        break;
                    case 3:
                        // Find vehicles by year range
                        break;
                    case 4:
                        // Find vehicles by color
                        break;
                    case 5:
                        //Find vehicles by mileage range
                        break;
                    case 6:
                        // Find vehicles by type (car,truck,suv,van,etc)
                        break;
                    case 7:
                        //List All vehicles
                        displayAllVehicles();
                        break;
                    case 8:
                        //Add a vehicle
                        DealerShip.addVehicle();
                        break;
                    case 9:
                        // Remove a vehicle
                        DealerShip.removeVehicle();
                        break;
                    case 99:
                        //ends app
                        System.out.println("Shutting down");
                        System.exit(0);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void displayAllVehicles() {
        System.out.println("All vehicles in the dealership:");
        try {
//            DealerShip dealerShip = DealershipFileManager.getDealershipObjects();

//            System.out.println("Dealership: " + dealerShip.getName() + " " + dealerShip.getAddress() + " " + dealerShip.getPhone() + " ");
            for (Vehicle vehicle : vehicles) {
                System.out.println("Vin: " + vehicle.getVin());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make: " + vehicle.getMake());
                System.out.println("Model: " + vehicle.getModel());
                System.out.println("Color: " + vehicle.getColor());
                System.out.println("Odometer: " + vehicle.getOdometer());
                System.out.println("Price: " + vehicle.getPrice());
                System.out.println("-".repeat(60));
                System.out.println();
            }
            System.out.println(vehicles.size());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
