package Boxing_UnBoxing;

/*
Boxing: The process of converting a value type instance to an object refrence.
When boxing happens CLR creates an object in the Heap and then creates a
a reference in the stack. So the value stroed in the heap along with an
object refernce in the stack when boxing.
*/

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // Boxing: Converting primitive types to their corresponding wrapper objects

        int number = 42;
        Integer boxedNumber = Integer.valueOf(number); // Boxing

        double value = 3.14;
        Double boxedValue = Double.valueOf(value); // Boxing

        char letter = 'A';
        Character boxedLetter = Character.valueOf(letter); // Boxing

        // Unboxing: Converting wrapper objects back to their corresponding primitive types

        int unboxedNumber = boxedNumber.intValue(); // Unboxing

        double unboxedValue = boxedValue.doubleValue(); // Unboxing

        char unboxedLetter = boxedLetter.charValue(); // Unboxing

        System.out.println("Boxed number: " + boxedNumber);
        System.out.println("Unboxed number: " + unboxedNumber);

        System.out.println("Boxed value: " + boxedValue);
        System.out.println("Unboxed value: " + unboxedValue);

        System.out.println("Boxed letter: " + boxedLetter);
        System.out.println("Unboxed letter: " + unboxedLetter);
    }
}

