package Generics;

import java.util.ArrayList;

public class pairBox <T extends Number, V extends Number>{
    private T elementOne;
    private V elementTwo;

    public pairBox(T elementOne, V elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public T getElementOne() {
        return elementOne;
    }

    public void setElementOne(T elementOne) {
        this.elementOne = elementOne;
    }

    public V getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(V elementTwo) {
        this.elementTwo = elementTwo;
    }
    public void productBox(T value, V value2){
        System.out.println("The product is : "+ value.doubleValue()* value2.doubleValue());
    }
}
