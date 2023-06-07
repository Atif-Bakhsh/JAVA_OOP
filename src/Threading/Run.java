package Threading;

//Runnable
public class Run implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ " - Thread Run");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
