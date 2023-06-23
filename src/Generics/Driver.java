package Generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {


        List<Integer> mylist1 = new ArrayList<>();

        mylist1.add(1);
        mylist1.add(10);

//        Genericowo<Integer> generic = new Genericowo<>();

//        generic.printList(mylist1);

        Printer<Integer> printerInteger = new Printer<>(6742);
        printerInteger.print();

        Printer<Double> printerDouble = new Printer<>(242.2);
        printerDouble.print();

        Printer<String> printerStrign = new Printer<>("Willy");
        printerStrign.print();

        TwoPrinters<Integer, String> twoPrinters = new TwoPrinters<>(42, "No-Way");
        twoPrinters.print();
        TwoPrinters<String, Boolean> twoPrinters2 = new TwoPrinters<>("Is it ", true);
        twoPrinters2.print();

//        Generic Arraylists
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("GoodMorning");
        printArrayList(stringList);

        //    Multiiply of inside the box.
        pairBox<Double, Double> pairbox = new pairBox<>(null,null);
        pairbox.productBox(10.00,3.00);
//        System.out.println(pairbox);

    }
//    private static void printList(List<?> myList){
//        System.out.println();
//    }
    private static <T> void printArrayList(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
    }
}

//class Genericowo<T>
//{
//    public void printList(List<T> myList)
//    {
//        System.out.println(myList);
//    }
//}
