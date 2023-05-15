package ShallowCopy_DeepCopy;

import java.util.Arrays;

public class ShallowCopy {

    private int[] data;

    public ShallowCopy(int[] data) {
        this.data = data;
    }

    public void display() {
        System.out.println(Arrays.toString(data));
    }
}
