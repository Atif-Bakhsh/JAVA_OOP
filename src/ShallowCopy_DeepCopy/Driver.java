package ShallowCopy_DeepCopy;

public class Driver {
    public static void main(String[] args) {
        int[] values = {30, 4, 9};
        ShallowCopy sc = new ShallowCopy(values);
        sc.display();

        int[] vals = {3, 7, 9};
        DeepCopy dc = new DeepCopy(vals);
        dc.display();
        vals[0] = 13;
        dc.display();
    }
}
