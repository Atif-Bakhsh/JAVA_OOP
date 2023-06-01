package Generics;

public class Printer <T>{
    public T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
