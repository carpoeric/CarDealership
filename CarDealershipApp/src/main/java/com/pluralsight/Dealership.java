package com.pluralsight;


import java.util.ArrayList;
import java.util.List;

public class Dealership
{
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone)
    {
        this.inventory = new ArrayList<Vehicle>();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String getAddress()
    {
        return address;
    }


    public void setAddress(String address)
    {
        this.address = address;
    }


    public String getPhone()
    {
        return phone;
    }


    public void setPhone(String phone)
    {
        this.phone = phone;
    }


    public ArrayList<Vehicle> getInventory()
    {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory)
    {
        this.inventory = inventory;
    }

    public List<Vehicle> getVehiclesPrice(double min,double max)
    {
        List<Vehicle> filteredArray = new ArrayList<Vehicle>();

        for(Vehicle vehicle:inventory)
        {
            if (vehicle.getPrice()>=min && vehicle.getPrice()<=max)
            {
                filteredArray.add(vehicle);
            }
        }
        return filteredArray;
    }

    public List<Vehicle> getVehiclesMakeModel(String make, String model)
    {
        List<Vehicle> filteredArray = new ArrayList<>();

        for(Vehicle vehicle:inventory)
        {
            if (vehicle.getMake().equalsIgnoreCase(make) || vehicle.getModel().equalsIgnoreCase(model))
            {
                filteredArray.add(vehicle);
            }
        }
        return filteredArray;
    }

    public List<Vehicle> getVehiclesYear(int min,int max)
    {
        List<Vehicle> filteredArray = new ArrayList<>();

        for(Vehicle vehicle:inventory)
        {
            if (vehicle.getYear()>=min && vehicle.getYear()<=max)
            {
                filteredArray.add(vehicle);
            }
        }
        return filteredArray;
    }

    public List<Vehicle> getVehiclesColor(String color)
    {
        List<Vehicle> filteredArray = new ArrayList<>();

        for(Vehicle vehicle:inventory)
        {
            if (vehicle.getColor().equalsIgnoreCase(color) )
            {
                filteredArray.add(vehicle);
            }
        }
        return filteredArray;
    }

    public List<Vehicle> getVehiclesMileage(int min, int max)
    {
        List<Vehicle> filteredArray = new ArrayList<>();

        for(Vehicle vehicle:inventory)
        {
            if (vehicle.getOdometer()>=min && vehicle.getOdometer()<=max)
            {
                filteredArray.add(vehicle);
            }
        }
        return filteredArray;
    }

    public List<Vehicle> getVehiclesType(String type)
    {
        List<Vehicle> filteredArray = new ArrayList<>();

        for(Vehicle vehicle:inventory)
        {
            if (vehicle.getVehicleType().equalsIgnoreCase(type) )
            {
                filteredArray.add(vehicle);
            }
        }
        return filteredArray;
    }

    public List<Vehicle> getAllVehicles()
    {
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle)
    {
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle)
    {
        this.inventory.remove(vehicle);
    }
}