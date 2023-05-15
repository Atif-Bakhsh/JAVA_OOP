package arrayList;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ArrayList<circle> list1 = new ArrayList<circle>();

        circle c1 = new circle(3);
        circle c2 = new circle(4);
        circle c3 = new circle(8);
        circle c4 = new circle(2);
        circle c5 = new circle(5);
        list1.add(c1);
        list1.add(c2);
        list1.add(c3);
        list1.add(c4);
        list1.add(c5);

//        list1.stream(list1);


//        int sumofAllcircles = area(list1);


//        int sum = 0;
//        int temp = 0;
//        for (int i = 0; i < list.size(); i++) {
//            temp = list.get(i).getRadius();
//
//            if (temp >= 5){
//                sum += list.get(i).area();
//                System.out.println(" - This is the area of circle "+i+" = "+(int)list.get(i).area());
//            }
//        }
//        System.out.println(" - This is the sum of areas of all the circles with R >= 5 = "+sum);

        areaOfAllObjects(list1);
        areOfSingleObjects(list1);

    }

    //    private static int area(ArrayList<circle> list) {
//    }
    public static void areaOfAllObjects(ArrayList<circle> list) {
        int sum = 0;
        int temp = 0;
        for (arrayList.circle circle : list) {
            temp = circle.getRadius();

            if (temp >= 5) {
                sum += circle.area();
            }
        }
        System.out.println(" - This is the sum of areas of all the circles with R >= 5 = " + sum);
    }

    public static void areOfSingleObjects(ArrayList<circle> list) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i).getRadius();
            if (temp >= 5) {
                sum += list.get(i).area();
                System.out.println(" - This is the area of circle " + list.get(i) + " = " + (int) list.get(i).area());
            }
        }
    }
}
