package Lambdas;

public class Cat2 implements Printable{
    public String name;
    public int age;

    public Cat2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat2(){}
    public void print(){
        System.out.println("Mew");
    }

    @Override
    public String print(String suffix) {
        return null;
    }

}
