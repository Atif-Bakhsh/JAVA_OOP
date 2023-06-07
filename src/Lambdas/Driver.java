package Lambdas;

public class Driver {
    public static void main(String[] args) {
        Printable lambdaPrintable = (s) -> "Mew" + s;
        System.out.println(lambdaPrintable);
        System.out.println(lambdaPrintable.print("Mew"));
        printThings(lambdaPrintable);
    }
    static void printThings(Printable printable) {
        System.out.println(printable.print("!!!!"));
    }
}
