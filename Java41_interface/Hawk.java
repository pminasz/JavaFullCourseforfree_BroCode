package Java41_interface;

public class Hawk implements Predator, Odchody{
    @Override
    public void chase() {
        System.out.println("the hawk is chasing its prey");
    }

    @Override
    public void hunt() {
        System.out.println("darn hawk is hunting");
    }
    @Override
    public String toString() {
        return "hawk jego mać";
    }


    @Override
    public void kupa() {
        System.out.println("przebrzydłe ptaszysko, a fuj");

    }

    @Override
    public void sraczka() {
        System.out.println("łupsi łupsi");
    }
}
