// Parent class
class Vehicle {
    String brand;

    
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called.");
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand); 
        this.model = model;
        System.out.println("Car constructor called.");
    }

    void display() {
        System.out.println("Brand: " + this.brand + ", Model: " + this.model);
        
    }
}

public class TestDrive {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.display();
    }
}

