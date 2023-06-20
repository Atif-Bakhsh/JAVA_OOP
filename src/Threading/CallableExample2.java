//package Threading;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class CallableExample2 {
//    public static void main(String[] args) {
//        // Create an ExecutorService with a fixed thread pool size
//
//        // Create a Callable task
//        Callable<Integer> task = () -> {
//            System.out.println("Callable task executing...");
//            Thread.sleep(2000); // Simulating some time-consuming task
//            return 42;
//        };
//
//        // Submit the Callable task to the executor
//        Future<Integer> future = executor.submit(task);
//
//        // Do other work while the Callable task is executing
//
//        try {
//            // Get the result of the Callable task (blocking until it's done)
//            Integer result = future.get();
//            System.out.println("Callable task result: " + result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Shutdown the executor
//        executor.shutdown();
//    }
//}
//
