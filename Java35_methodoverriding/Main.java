package Java35_methodoverriding;

public class Main {
    public static void main(String[] args) {
        // method overriding =  declaring a method in subclass
        //                      which is already present in parent class
        //                      done so that a child class can give its own implementation it inherits from the parent class

        Dog pies = new Dog();
        pies.sound();
        Animal zwierzak = new Animal();
        zwierzak.sound();
        CatCat kotek = new CatCat();
        kotek.sound();

    }
}
