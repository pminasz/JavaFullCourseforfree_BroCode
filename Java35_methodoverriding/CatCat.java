package Java35_methodoverriding;

public class CatCat extends Animal{
    @Override
    void sound() {
        super.sound();
        System.out.println("the cat goes meow");
        super.sound();
    }
}
