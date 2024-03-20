package Java_Interfaces;

public class Rabbit implements Prey {
    // to implement the method flee from Interface Pray, when defining the class Rabbit, add Implements Pray
    // after adding the key word implements, the Prey class needs to be ether declared abstract
    // or implement abstract method. in this case flee()
    @Override
    public void flee() {
    // here's what i want Rabitt to do when calling the flee method
        System.out.println("the rabbit is fleeing");
    }


}
