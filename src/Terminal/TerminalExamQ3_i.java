package Terminal;

class B<T> {
    private T value1;
    private T value2;

    public B(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}

public class TerminalExamQ3_i {
    public static void main(String[] args) {
        B<Double> b2 = new B<>((Double) 4.4, (Double) 0.9);
    }
}

