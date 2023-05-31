package Threading;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable{
    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        Integer random = generator.nextInt(5);
        Thread.sleep(random * 1000);
        return random;
    }
}
