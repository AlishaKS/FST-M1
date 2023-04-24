package Activities;

public class Activity1 {

    public static void main(String[] args) {
        Activity1Car toyota = new Activity1Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }
}