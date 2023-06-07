package Threading;

//Threads allows a program to operate more efficiently by doing multiple things at the same time.
//Threads can be used to perform complicated tasks in the background without interrupting the main program.

//Thread
public class Threading extends Thread{
    int ThreadNo;
    public Threading(int ThreadNo) {
        this.ThreadNo = ThreadNo;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ " - Thread Threading : "+ ThreadNo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
