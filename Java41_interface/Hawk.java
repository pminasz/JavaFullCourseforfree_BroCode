package Java41_interface;

public class Hawk implements Predator{
    @Override
    public void chase() {
        System.out.println("the hawk is chasing its prey");

    }

    @Override
    public void hunt() {
        System.out.println("darn hawk is hunting");
    }
}
