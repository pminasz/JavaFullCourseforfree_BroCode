package Java31_arrayofobjects;

public class Main {

    public static void main(String[] args) {

//        int[] numery = new int[3];
//        char[] znaki = new char[4];
//        String[] stringi = new String[5];

//        Food[] refrigerator = new Food[3];

//        Food food1 = new Food("pizza");
//        Food food2 = new Food("hamburger");
//        Food food3 = new Food("hot-dog");

//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;
//
//        System.out.println(refrigerator[0].name);
//        System.out.println(refrigerator[1].name);
//        System.out.println(refrigerator[2].name);

        //lub

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot-dog");

        Food[] refrigerator = {food1, food2, food3};


        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);


    }
}
