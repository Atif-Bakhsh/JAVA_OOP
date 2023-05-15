package Inheritance;

public class Driver {
    public static void main(String[] args) {

        Composition composition = new Composition("Archi", "UET");
        System.out.println(composition.getComposition2() + " " + composition.getUniName());
        System.out.println(composition.toString());

        Aggregation2 aggregation2 = new Aggregation2("Fahad");
        Aggregation aggregation = new Aggregation(aggregation2, "DevSink");
        System.out.println(aggregation.toString());
    }
}
