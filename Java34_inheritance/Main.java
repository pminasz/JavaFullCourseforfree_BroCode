package Java34_inheritance;

public class Main {
    public static void main(String[] args) {
        // inheritance =    the process where one class acquires,
        //                  the attributes and methods of another
        //



        Car samochod = new Car();
        samochod.go();

        Bicycle rower = new Bicycle();
        rower.stop();

        System.out.println(samochod.speed);
        System.out.println(rower.speed);

        // subclasses can have their own additional attributes additional to the attributes that are common for both classes

        System.out.println(samochod.doors);
        System.out.println(rower.pedals);

    }
}
