package ShallowCopy_DeepCopy;

import java.util.Arrays;

public class DeepCopy {
    private int[] data;

    public DeepCopy(int[] value) {
        this.data = new int[value.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = value[i];
        }

    }

    public void display() {
        System.out.println(Arrays.toString(data));
    }
}
