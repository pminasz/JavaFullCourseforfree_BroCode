package Java37_abstraction;
// car is a subclass, also known as a child class of the Vehicle class
public class Car extends Vehicle{
    // I need to implement the method from the parent class Vehicle and make a class abstract
    // in this case I implement the method Vegicle.go from the Vehicle class
    @Override
    void go() {
        // here now I add more specific implementation for Car
        System.out.println("the driver is driving the car");
        // that way we want to force the user to pick a certain type of Vehicle, from class that inherits from Vehicle class

    }
}
