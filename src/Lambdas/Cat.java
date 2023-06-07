package Lambdas;

public class Cat implements Printable{
//    private final String name;
//
//    public Cat(String name, int age, String color) {
//        this.name = name;
//        this.age = age;
//        this.color = color;
//    }
//    public Cat()
//    {
//
//    }
//
//    @Override
//    public void sound() {
//        System.out.println("Meow");
//    }

    @Override
    public String print(String suffix) {
        return "Mew" + suffix;
    }
}
