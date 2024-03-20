package Java_Abstraction;
// add abstract modifier
public abstract class Vehicle {
    // abstract method with an abstract keyword
    // no need the body for this method, in fact I can't add the body otherwise I get an error
        //instead it forces me to implement this method in one of the child classes of the Vehicle class
    abstract void go();

}
