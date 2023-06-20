package Terminal;

import java.util.Scanner;
public class TerminalTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int array[] = new int[]{10};
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException Ocured");
        }
        catch (RuntimeException e)
        {
            System.out.println("RuntimeException occured");
        }
        catch (Exception e)
        {
            System.out.println("Exception Occured");
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}

