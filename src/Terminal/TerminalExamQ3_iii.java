package Terminal;

import java.util.ArrayList;

public class TerminalExamQ3_iii {
    public static void main(String[] args) {
        ArrayList<C> List = new ArrayList<>();
        C c1 = new C(44);
        C c2 = new C(55);
        List.add(c1);
        List.add(c2);
        int sum = 0;
        for (C c : List) {
            sum += c.x;
        }
        System.out.println(sum);
//        ArrayList<C> list=new ArrayList<>();
//        C c1 = new C(new A(1), new ArrayList<String>());
//        C c2 = new C(new A(1), new ArrayList<String>());
//        list.add(c1);
//        list.add(c2);

    }
}
class C
{
    int x;
    public C(int x)
    {
        this.x = x;
    }
}
