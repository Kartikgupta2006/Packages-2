package Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multiThreadExecutorService {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(5)){
            for (int i = 0; i < 10; i++) {
              SleepTask task = new SleepTask();
              service.submit(task);
           }
            if(!service.awaitTermination(20, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY ShutDown");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
