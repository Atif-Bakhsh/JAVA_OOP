package Terminal;

public class TerminalTest4 {
    public static void main(String[] args) {
        Edible obj[] = {new Chicken4(), new Apple4(), new Orange4()};
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].howToEat());
        }
    }
}
interface Edible
{
    public String howToEat();
}
class Chicken4 implements Edible
{
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }
}
abstract class Fruit4 implements Edible {
}
class Orange4 extends Fruit4
{
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}
class Apple4 extends Fruit4
{
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

