package Threading;

public class Driver {

    public static void main(String[] args) {
//        Run run = new Run();
//        Threading threading = new Threading();
//        run.run();
//        threading.run();
////        run,start
        Threading threading = new Threading();
        threading.start();

        Run run_Thread = new Run();
        Thread thread = new Thread(run_Thread);
        thread.start();
    }
}
