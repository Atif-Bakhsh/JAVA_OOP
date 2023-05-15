package Searchign;

import java.util.ArrayList;
import java.util.Scanner;

public class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person1() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*public boolean equals(Object o)
    {
        Person temp=(Person)o;
        return this.name.equals(temp.name);
    }*/

    public void search(ArrayList<Person1> list) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for (Person1 person : list)
            if (person.name.equals(name))
                System.out.println(person.toString());


    }

}
