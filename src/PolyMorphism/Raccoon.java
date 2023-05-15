package PolyMorphism;

public class Raccoon extends Animal {
    public Raccoon() {
        super();
    }

    //  WE OVERRIDE THE MAIN PARENT CLASS (ANIMAL).
    @Override
    public void eat() {
        System.out.println(" - I eat ur brain!!");
    }
}
 