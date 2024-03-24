package Java32_objectpassing;

public class Main {
        // passing objects as arguments to the method
    //When declaring this method we have to have the parameters set up to accept object of that datatype
    public static void main(String[] args) {
        Garage garaz = new Garage();
        Car samochod1 = new Car("BMW");
        Car samochod2 = new Car("Tesla");

        garaz.park(samochod1);
        garaz.park(samochod2);

    }
}
