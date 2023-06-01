package Generics;

public class TwoPrinters <T, V>{
    public T thingOne;
    public V thingTwo;

    public TwoPrinters(T thingOne, V thingTwo) {
        this.thingOne = thingOne;
        this.thingTwo = thingTwo;
    }
    public void print(){
        System.out.println(thingOne+" , "+thingTwo);
    }
}
