package ShallowCopy_DeepCopy;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        int[] values = {30, 4, 9};
        ShallowCopy sc = new ShallowCopy(values);
        sc.display();
        values[0] = 13;
        sc.display();

        int[] vals = {3, 7, 9};
        DeepCopy dc = new DeepCopy(vals);
        dc.display();
        vals[0] = 13;
        dc.display();

        // Make a shallow copy but use an Arraylist instead of an array
         ArrayList<Integer> arrayvalues = new ArrayList<>();
         arrayvalues.add(3123);
         arrayvalues.add(731);
         arrayvalues.add(913);
         ShallowCopyArrayList shallowCopyArrayList = new ShallowCopyArrayList(arrayvalues);
         shallowCopyArrayList.display();
         arrayvalues.set(0, 13);
         shallowCopyArrayList.display();


        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(123);
        originalList.add(26465);
        originalList.add(3123009);

        DeepCopyArrayList deepCopyObj = new DeepCopyArrayList(originalList);
        ArrayList<Integer> copiedList = deepCopyObj.deepCopyArrayList();

        System.out.println("Original List:");
        deepCopyObj.displayArrayList();

        System.out.println("Copied List:");
        for (Integer value : copiedList) {
            System.out.println(value);
        }
        System.out.println();
        originalList.set(0, 13);
        deepCopyObj.displayArrayList();
    }
}
