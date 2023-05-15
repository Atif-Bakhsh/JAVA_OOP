package compareTo;

public class Drive {
    public static void main(String[] args) {
        Person person1 = new Person(21);
        Person person2 = new Person(18);

        int compasirion = person1.compareTo(person2);
        System.out.println(compasirion);
    }
}
