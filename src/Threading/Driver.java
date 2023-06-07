package Threading;

public class Driver {

    public static void main(String[] args) throws InterruptedException {
//        Run run = new Run();
//        Threading threading = new Threading();
//        run.run();
//        threading.run();
////        run,start
//        Threading threading = new Threading();
//        threading.start();
//
//        Run run_Thread = new Run();
//        Thread thread = new Thread(run_Thread);
//        thread.start();
//
        for (int i = 0; i < 3; i++) {
            Threading threading = new Threading(i);
            threading.start();
            threading.join();
        }
        Run run = new Run();
        Thread thread = new Thread(run);
        thread.start();
    }
}
