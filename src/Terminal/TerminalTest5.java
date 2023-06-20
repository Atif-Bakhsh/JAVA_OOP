package Terminal;

public class TerminalTest5 {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[2];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = new Shape();
            System.out.println(shapes[i].id+":"+shapes[i].name);
        }

    }
}
class Shape
{
    static int id;
    String name;

    public Shape() {
        id++;
        if(id==1)
        {
            name = "Circle";
        }
        else
        {
            name = "Rectangle";
        }
    }
}

