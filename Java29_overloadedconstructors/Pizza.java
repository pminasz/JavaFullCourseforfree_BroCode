package Java29_overloadedconstructors;

public class Pizza {

    String ciasto;
    String sosik;
    String ser;
    String posypka;

    Pizza(String bread){
        this.ciasto = bread;
        //sosik = sauce;
        //ser = cheese;
        //posypka = topping;
    }

    Pizza(String bread, String sauce){
        this.ciasto = bread;
        sosik = sauce;
        //ser = cheese;
        //posypka = topping;
    }

    Pizza(String bread, String sauce, String cheese){
        this.ciasto = bread;
        sosik = sauce;
        ser = cheese;
        //posypka = topping;
    }

    Pizza(String bread, String sauce, String cheese, String topping){
        this.ciasto = bread;
        sosik = sauce;
        ser = cheese;
        posypka = topping;
    }

}

