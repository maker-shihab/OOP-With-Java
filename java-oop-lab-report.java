// Course Name: Object Oriented Programming
// Course Code: CSE-212
// Report Name: Write a java program using multilevel inheritance


// Parent Class
class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Child Class extends Parent
class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String make, String model, int year, int numDoors, String fuelType) {
        super(make, model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    public void displayCarInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Sub child class
class ElectricCar extends Car {
    private int batteryCapacity;
    private int chargingTime;

    public ElectricCar(String make, String model, int year, int numDoors, String fuelType, int batteryCapacity, int chargingTime) {
        super(make, model, year, numDoors, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    public void displayElectricCarInfo() {
        super.displayCarInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}
// Main class with declaration
public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 2022, 4, "Electric", 60, 8);
        electricCar.displayElectricCarInfo();
    }
}

/* Output:
  Make: Tesla
  Model: Model 3
  Year: 2022
  Number of Doors: 4
  Fuel Type: Electric
  Battery Capacity: 60 kWh
  Charging Time: 8 hours
*/