//https://www.youtube.com/watch?v=xk4_1vDrzzo
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


        // practiceCat


        practice_Cat kotek = new practice_Cat("Mini", "dachowiec", 5);
        practice_Cat kotek2 = new practice_Cat("Mucha", "dachowczyni", 2);

        System.out.println(kotek.bread);
        System.out.println(kotek2.bread);
        System.out.println(kotek2.name);

        kotek.play();
        kotek2.scratch();

        kotek2.play();
        kotek.scratch();
    }


}
