package Java33_statickeyword;

public class Friend {

    String name;
    //all instances of the Friend class have to share this variable
    // so use the static keyword modifier, the data type
    static int numberOffriends;
    //int numberOffriends;

    Friend(String imie){
        this.name = imie;
        numberOffriends++;
    }

    //static method
    static void displayFriends() {
        System.out.println("you have "+numberOffriends+" friends ");

    }

}
