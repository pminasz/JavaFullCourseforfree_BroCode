package Java34_inheritance;

public class Car extends Vehicle {
    //the car class will receive the attributes from the vehicle class without listing it twice
    // in order to list , when defining the class, we add the word "extends" and the name of the class
    // now the car class is a subclass of the vehicle class known as child class, the vehicle class is a super class (parent)

    // subclasses can have their own additional attributes
    int wheels = 4;
    int doors = 4;
}
