package Overring_OverloadingMethods;

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal is making a sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog is barking
    }
}

