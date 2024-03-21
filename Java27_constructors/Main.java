package Java27_constructors;

public class Main {
    public static void main(String[] args) {


        // constructor is a special method that is called when an object is instantiated (created) (here in Main class)

        Human czlowiek1 = new Human("PJ", 51, 81.5);
        Human czlowiek2 = new Human("Dora", 41, 61.5);
        //passing arguments to a constructor is useful, because this gives an ability to create different objects
        //that have different attributes

        //here is different human with different attributes (name, age, weight)
        System.out.println(czlowiek1.name);

        czlowiek2.eat();
        czlowiek1.drink();
    }
}
