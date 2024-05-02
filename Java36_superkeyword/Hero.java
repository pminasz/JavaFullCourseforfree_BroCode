package Java36_superkeyword;

public class Hero extends Person{
    // attribute
    String power;

    //constructor
    //set parameters for Here constructor (in parenthesis)

    Hero(String imie, int wiek, String sila) {
        //assign the values to each of the attributes of the Hero
//        this.name = imie;
//        this.age = wiek;
//        this.power = sila;
        //the way written above works but it's not the best way of writing it
        //since the name and age is declared within the Person class , these values should be assigned with the constructor of the Person class
        //      and with the Hero class, only the Power variable should be declared
        //      the Power value should be declared with the constructor of the Hero class
        super(imie, wiek); // super must be called first

        this.power = sila; //
    }
    //the use of super keyword to call the method within the super class

    //let's say, the Here class (like Person class) has toString method to display the name and age variables
    public String toString() {
        return super.toString() + this.power;
    }
}
