package Java_Interfaces;
 // implementing two  interfaces to the class Fish
public class Fish implements Predator, Prey {
    // adding any unimplemented methods...
     // there are three methods, 1 from pray and 2 from predator
     @Override
     public void chase() {
         System.out.println("chasing is fun, when you are hungry");

     }

     @Override
     public void hunt() {
         System.out.println("this nought fish is hunting smaller fish ");

     }

     @Override
     public void flee() {
         System.out.println("however, this naughty fish is running away from the mean sharks");

     }
 }
