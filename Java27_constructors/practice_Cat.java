package Java27_constructors;

public class practice_Cat {
    String name;
    String bread;
    int age;
    practice_Cat (String imie, String rasa, int wiek) {
        name = imie;
        bread = rasa;
        age = wiek;
    }

    void play() {
        System.out.println(name+" is playing with a tennis ball");
    }

    void scratch() {
        System.out.println(bread+" is scratching a lot");
    }

}
