package Java36_superkeyword;

public class Main {
    public static void main(String[] args) {
        //  super =     keyword refers to the superclass (parent) of an object
        //              very similar to "this" keyword
        //              "this" refers to the class that "this" keyword contains
        //              "super" is referring to this object's parent class

        //Instantiation of Hero
        //send some arguments of the constructor for Hero
        Hero bohater1 = new Hero("Batman", 42, "$$$");
        Hero bohater2 = new Hero("Superman", 45, "$$$%$$$");

        System.out.println(bohater1.name);
        System.out.println(bohater1.age);
        System.out.println(bohater1.power);

        System.out.println(bohater2.toString());
        System.out.println(bohater1.toString());
    }
}
