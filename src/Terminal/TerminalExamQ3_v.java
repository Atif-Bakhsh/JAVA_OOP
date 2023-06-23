package Terminal;

import java.util.ArrayList;

public class TerminalExamQ3_v {
    public static void main(String[] args) {
        ArrayList<Civ> List = new ArrayList<>();
        Civ c1 = new Civ(44);
        Civ c2 = new Civ(55);
        List.add(c1);
        List.add(c2);
        int sum = 0;
        for (Civ civ : List) {
            sum += civ.x;
        }
        System.out.println(sum);
        System.out.println(c1.compareTo(c2));
        c2.compareTo(c1);
//        System.out.println( (new C(0)) instanceof Interface1);
    }
}
class Civ implements Comparable<Civ>
{
    int x;
    public Civ(int x)
    {
        this.x = x;
    }

    @Override
    public int compareTo(Civ o) {
        return this.x - o.x;
    }
}
