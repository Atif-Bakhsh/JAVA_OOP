package ShallowCopy_DeepCopy;

import java.util.ArrayList;

public class DeepCopyArrayList {
    private ArrayList<Integer> list;
    private ArrayList<Object> values;

    public DeepCopyArrayList(ArrayList<Integer> list) {
        this.list = list;
    }

//    public ArrayList<Integer> deepCopyArrayList() {
//        ArrayList<Integer> newList = new ArrayList<>();
//
//        for (Integer value : list) {
//            newList.add(new Integer(value));
//        }
//
//        return newList;
//    }
    public void displayArrayList() {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

    public ArrayList<Integer> deepCopyArrayList() {
        ArrayList<Integer> newList = new ArrayList<>(list);
        return newList;
    }
}
