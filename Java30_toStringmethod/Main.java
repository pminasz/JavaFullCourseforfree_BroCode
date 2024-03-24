package Java30_toStringmethod;

public class Main {
    public static void main(String[] args) {

        // toString() =     special method that all objects inherit,
        //                  that returns a string that, "textually represents" an object.
        //                  can be used both implicitly and explicitly

        Car samochod = new Car();
//        System.out.println(samochod.make);
//        System.out.println(samochod.model);
//        System.out.println(samochod.color);
//        System.out.println(samochod.year);

        System.out.println(samochod+"\n");
        System.out.println(samochod.toString());


    }

}
