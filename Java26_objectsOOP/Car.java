package Java26_objectsOOP;

public class Car {
        //attributes - model
//    String make = "Chevrolet";
//    String model = "Corvette";
//    int year = 2020;
//    String color = "blue";
//    double price = 50000.00;
    String make;
    String model;
    int year;
    String color;
    double price;

    //constructor:
    Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
    }

    // methods (what actions the Car object can perform
    void drive() {
        System.out.println("you drive a car: "+ this.make);
    }
    void brake() {
        System.out.println("you step on the brakes");
    }


}
