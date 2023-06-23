package Abstraction;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public double getArea(){
        return Math.pow(side, 2);
    }
    public double getPerimeter(){
        return 4 * side;
    }
    public void printInfo(){
        System.out.println("Square");
        System.out.println("Side: " + side);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
