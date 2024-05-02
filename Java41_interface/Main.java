package Java41_interface;

import java.lang.Object;
//https://www.youtube.com/watch?v=xk4_1vDrzzo

    // interface = a template that can be applied to a class
    //      similar to inheritance, but specifies what a class has/must do
    //      classes can apply more than one interface, inheritance is limited to 1 super class
public class Main {
    public static void main(String[] args) {


// create Rabbit object and test how it works
    Rabbit krulik = new Rabbit();
    // call the method flee
    krulik.flee();

    Hawk ptak = new Hawk();
    Hawk ptak2 = new Hawk();
    ptak.chase();
    System.out.println(ptak.toString());
    ptak.equals();
    ptak.hunt();
    ptak2.kupa();

    Fish ryba = new Fish();
    ryba.hunt();
    ryba.chase();
    ryba.flee();
    Fish rybka = new Fish();
    rybka.hunt();

    }

}
