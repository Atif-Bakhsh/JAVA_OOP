package ShallowCopy_DeepCopy;

import java.util.ArrayList;

public class ShallowCopyArrayList {
    private ArrayList<Integer> list;

    public ShallowCopyArrayList(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ShallowCopyArrayList{" +
                "list=" + list +
                '}';
    }
    public void display() {
        System.out.print(" - ");
        for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println(".");
    }
}
