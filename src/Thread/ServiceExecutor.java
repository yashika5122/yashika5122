package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServiceExecutor {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);

        for (int i=0; i<100;i++){
            System.out.println(i);
            executorService.execute(new CpuExtensiveTask());
        }
    }
    static class CpuExtensiveTask implements Runnable{

        public void run(){
            System.out.println("CpuExtensiveTask :"+ Thread.currentThread().getName());
        }
    }
}


