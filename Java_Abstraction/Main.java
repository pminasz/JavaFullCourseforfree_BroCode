package Java_Abstraction;

public class Main {
    // abstract = abstract classes cannot be instanciated, but they can have a subclass
    //             abstract methods are declared without an implementation
    public static void main(String[] args) {
        // create objects from both classes (instances of the both classes)
        Car car = new Car();
        // because of the abstract alert in Vehicle class, I cannot create here Vehicle object, i have to pick a certain type of Vehicle
        // Vehicle vehicle = new Vehicle();
        // Now, it's the same, as what we would normally do with calling the method:
        car.go();

        //that's the whole point of the abstract class. It adds a security layer to the program
        //It can be applied to both , the classes and methods
        // If it's applied to the class, the user cannot instantiate the instance of tha abstract class
        // with the abstract method, they are declared without the implementation, but the subclass or the child class
        // has to implement it somewhere
    }

}
