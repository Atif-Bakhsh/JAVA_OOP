package Terminal;

public class TerminalExam7 {
    public static void main(String[] args) {
        Super.Sub.display();
        Super ob1 = new Super();
        Super.Sub.display();
    }
}
class Super
{
    public static int number = 5;
    public Super()
    {
        number+=5;
    }

    static class Sub extends Super
    {

        public static void display()
        {
            number+=5;
            System.out.println("Value of number:"+number);
        }
    }
}

