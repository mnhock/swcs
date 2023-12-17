package swcs.gof.behavioral.templatemethod.callbackable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Client {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(new DefaultCallbackRunnable());
    }
}
