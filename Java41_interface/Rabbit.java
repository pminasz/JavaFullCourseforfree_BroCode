package Java41_interface;

public class Rabbit implements Prey, Odchody {
    // to implement the method flee from Interface Pray, when defining the class Rabbit, add Implements Pray
    // after adding the key word implements, the Prey class needs to be either declared abstract
    // or implement abstract method. in this case flee()
    @Override
    public void flee() {
    // here's what i want Rabitt to do when calling the flee method
        System.out.println("the rabbit is fleeing");
        System.out.println();
    }

    @Override
    public void kupa() {
        System.out.println("śmierdzi to mało powiedziane");

    }

    @Override
    public void sraczka() {
        System.out.println("łups, coś to się spłynęło");
    }
}
