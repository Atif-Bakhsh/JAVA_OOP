package Terminal;

public class TerminalTest6 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Character[] arr2 = {'O','O','P',' ','E','X','A','M'};
        printArray(arr);
        printArray(arr2);
    }

    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element);
        }
        System.out.println();
    }
}

