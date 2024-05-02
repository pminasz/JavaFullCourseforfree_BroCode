package Java36_superkeyword;

public class Person {
    //attributes
    String name;
    int age;
    //
    //the way written in Person class works, but it's not the best way of writing it
    //since the name and age is declared within the Person class , these values should be assigned with the constructor of the Person class
    //      and with the Hero class, only the Power variable should be declared
    //      the Power value should be declared with the constructor of the Hero class
    //constructor
    Person(String imie, int wiek) {
        this.name = imie;
        this.age = wiek;

    }

    //the use of super keyword to call the method within the super class

    //let's say, the Person class has toString method to display the name and age variables
    public String toString() {
        return this.name+ "\n" + this.age+ "\n";
    }
}
