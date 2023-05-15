package Searchign;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    ArrayList<Person> list = new ArrayList<Person>();
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    //    public void search(String name){
//        for (Person person: list) {
//            if(person.name.equals(name)){
//                System.out.println(person.toString());
//                System.out.println("Match");
//            }
//        }
//    }
    public void search(ArrayList<Person> list) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for (Person person : list)
            if (person.name.equals(name))
                System.out.println(person.toString());


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "list=" + list +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
