//
package Java26_objectsOOP;

public class Main {
    public static void main(String[] args) {
        //object = an instance of class that may contain attributes and methods
        //example: (phone, desk, computer, coffee cup)
        // for example, the characteristics (attributes) of coffee cup: String color =""; double temp =20.0; boolean empty = true;
        //methods : drink(); spill();


        //constructing an instance of another class
        //1. construct a Car object
        //2. create a unique name of this instance of the class. this unique nam of the car
        Car samochod = new Car("wolga", "RUS", 0 ,"null",0.0);
        //3. display some characteristic of the Car
        //3. type in the name of the Object(dot)attribute (here samochod.model)
        System.out.println(samochod.make);
        System.out.println(samochod.model);

        // to display the method, it's the same process as for instances
        //1. name of the object dot and the method I want to call
        samochod.drive();
        samochod.brake();

        //it's possible to reuse the class to create multiple instances of the class,
        //meaning that I can create a multiple objects
        Car samochodzik = new Car("syrenka", "FSO", 0 ,null,0.0);
        System.out.println(samochodzik.make);
        System.out.println(samochodzik.model);

        samochodzik.drive();
        samochodzik.brake();

    }


}
