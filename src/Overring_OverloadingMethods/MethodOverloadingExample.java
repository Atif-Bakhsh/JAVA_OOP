package Overring_OverloadingMethods;

public class MethodOverloadingExample {
    public void sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        example.sum(5, 3); // Output: Sum of two integers: 8

        example.sum(2.5, 3.7); // Output: Sum of two doubles: 6.2

        example.sum(2, 3, 4); // Output: Sum of three integers: 9
    }
}

