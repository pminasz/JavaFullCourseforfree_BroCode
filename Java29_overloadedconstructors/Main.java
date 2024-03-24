package Java29_overloadedconstructors;

public class Main {
    public static void main(String[] args) {

        // overloaded constructors =    multiple constructors within a class with the same name,
        //                              but have different parameters
        //                              name + parameters = signature

        //1. instantiate the instance of the Pizza class (pizza is a unique name for this class)
//        Pizza pizza = new Pizza("thick crust ", "tomato ", "mozzarella ", "peperoni ");
        Pizza pizza = new Pizza("thick crust ", "tomato ", "mozzarella ");
//        Pizza pizza = new Pizza("thick crust ", "tomato ");
//        Pizza pizza = new Pizza("thick crust ");
        System.out.println(" Here are the ingredients of your pizza: ");
        System.out.println(pizza.ciasto);
        System.out.println(pizza.sosik);
        System.out.println(pizza.ser);
        System.out.println(pizza.posypka);
    }
}
