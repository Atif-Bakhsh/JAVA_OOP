package Lambdas;

public class LambdaExample {
    public static void main(String[] args) {
        // Example 1: Lambda expression with a functional interface
        MyInterface myInterface = (str) -> System.out.println("Hello, " + str);
        myInterface.sayHello("Alice");

        // Example 2: Lambda expression with a different functional interface
        AnotherInterface anotherInterface = (a, b) -> a + b;
        int result = anotherInterface.calculateSum(2, 3);
        System.out.println("Sum: " + result);
    }
}

// Functional interface with a single abstract method
interface MyInterface {
    void sayHello(String name);
}

// Another functional interface with a single abstract method
interface AnotherInterface {
    int calculateSum(int a, int b);
}

