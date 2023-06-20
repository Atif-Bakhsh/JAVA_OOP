package Terminal;

public class TerminalTest {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        Child obj1 = new Child();
        Parent obj2 = new Parent();
    }
}
class Parent
{
    public Parent()
    {
        System.out.println("I am Parent class");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("I am child Class");
    }

}
class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("I am grand child class");
    }
}

