package Searchign;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

//        Person p = new Person("Mubeen","19");
//        Person p1 = new Person();
        ArrayList<Person> list = new ArrayList<Person>();
//        list.add(p);
//        p1.search("Mubeen");

        Person searcher = new Person();

        list.add(new Person("Musa", "19"));
        list.add(new Person("Ali", "19"));
        searcher.search(list);

    }
}
