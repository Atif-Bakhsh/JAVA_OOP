package PolyMorphism;

public class Bear extends Animal {
    public Bear() {
        super();
    }

    //    @Override
    public void eat(int i) {
//        super.eat();
        for (int j = 0; j < i; j++) {
            System.out.println(" - I eat everything!!");
        }
    }
}
