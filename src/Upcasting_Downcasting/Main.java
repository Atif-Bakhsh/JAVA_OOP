package Upcasting_Downcasting;

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // upcasting
        Dog dog = (Dog) animal; // downcasting
        dog.fetch(); // calls the fetch method in Dog class
    }
}

