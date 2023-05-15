package arrayList;

public class circle {
    //    arraylist circle type four obeects of circle and make function to calculate the are of only circles with only five radius. total are of everycircle and individual circel
    private int radius;
//    ArrayList<Integer> list = new ArrayList<Integer>();

    public circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //    Pass the array list as a parameter
    public double area() {
//        int sum = 0;
//        for (circle c : list) {
//            if (c.getRadius() >= 5) {
//                double area = c.getRadius() * c.getRadius() * 3.14;
//                System.out.println(area);
//                sum += area;
//            }
//        }
        return radius * radius * 3.14;
    }
//    int sum = 0;
//    int temp = 0;
//        for (int i = 0; i < list.size(); i++) {
//        temp = list.get(i).getRadius();
//
//        if (temp >= 5){
//            sum += list.get(i).area();
//            System.out.println(" - This is the area of circle "+i+" = "+(int)list.get(i).area());
//        }
//    }
//        System.out.println(" - This is the sum of areas of all the circles with R >= 5 = "+sum);
}
