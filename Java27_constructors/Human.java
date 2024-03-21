package Java27_constructors;

public class Human {

    String name;
    int age;
    double weight;
    //inside the constructor I assign these values with each of the above variables

    //constructor
    //set up arguments for the constructor in parentheses
    //set up three parameters for Human class
    Human(String name, int age, double weight) {
        //I need to assign (precede) each of these values to this "Human" specific object a keyword  "this" to assign values
        this.name  = name;
        this.age = age;
        this.weight = weight;

        //i need to imanage that i replace "this" keyword with the name of the object (here it's czlowiek)
        //with the help of considerate I can create objects that have different qualities
        // here I have two objects that are instanciated from the human class, but they have different attributes that make them unique

    }
    //human has two methods here
    void eat() {
        System.out.println(this.name+" is eating");
    }
    void drink() {
        System.out.println(this.name+" is drinking *burp*");
    }
}
