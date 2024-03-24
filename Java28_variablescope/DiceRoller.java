package Java28_variablescope;

import java.util.Random;

public class DiceRoller {

//    DiceRoller() {
//        Random chybiltrafil = new Random();
//        int number = 0;
//        roll(chybiltrafil, number);
//    }
//        void roll(Random chybiltrafil, int number){
//        number = chybiltrafil.nextInt(6)+1;
//            System.out.println(number);
//    }
    Random chybiltrafil;
    int number = 0;
    DiceRoller() {
        chybiltrafil = new Random();
        roll();
    }
    void roll(){
        number = chybiltrafil.nextInt(6)+1;
        System.out.println(number);
        number = chybiltrafil.nextInt(6)+1;
        System.out.println(number);
    }


}
