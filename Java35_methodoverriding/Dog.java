package Java35_methodoverriding;

public class Dog extends Animal{
    // the Dog class with inherit all that the animal class has

    //dog class will have its own implementation of the animal class
    //this is so called method overriding; method sound() is getting its new implementation here

    // the overridden class should have the @override annotation
    @Override
    void sound() {
        System.out.println("the dog goes *bark*");
    }


}
