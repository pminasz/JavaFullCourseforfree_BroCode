package Java33_statickeyword;

public class Main {
    public static void main(String[] args) {

        // static =     modifier. A single copy of a variable/method is created and share
        //              The class "owns" the static member

        //create an instance
        Friend przyjaciel1 = new Friend("Mini");
        Friend przyjaciel2 = new Friend("Tygrys");

        // all instances (here przyjaciele) are sharing th same numberOffriends variable
        // because there is a single copy and the class owns the static member
        // it is possible to access a static variable using an object's instance name themselves

        System.out.println(Friend.numberOffriends);
        //System.out.println(przyjaciel1.numberOffriends);
        //System.out.println(przyjaciel2.numberOffriends);

        // in order to call the static method displayFriends() class the class name, dot, the method
        Friend.displayFriends();

        // a good example of the static method is Round method of the Math class
        // this is an unrelated example
        //Math.round(a);

    }

}
