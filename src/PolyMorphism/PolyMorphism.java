package PolyMorphism;

public class PolyMorphism {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        // Upcasting
        Animal animal1 = new Raccoon();
        animal1.eat();
        Raccoon raccoon = new Raccoon();
        raccoon.eat();

        // Upcasting
        Animal animal2 = new Fox();
        animal2.eat();
        Fox fox = new Fox();
        fox.eat();

        Bear bear = new Bear();
        bear.eat(3);
    }
}
