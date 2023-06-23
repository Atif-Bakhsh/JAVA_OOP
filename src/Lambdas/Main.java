package Lambdas;

public class Main {
    public static void main(String[] args) {
        MyInterface2 myInterface2 = (name, id) -> System.out.println("Name: " + name + " ID: " + id);
        myInterface2.doSomething("Waleed", 145);
    }
}
