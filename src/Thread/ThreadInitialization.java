package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* There are two ways to initialise the thread
    1st by extending thread class*/
public class ThreadInitialization extends Thread{

    public void run(){
        System.out.println("thread");
    }
    public static void main(String[] args) {
        ThreadInitialization th = new ThreadInitialization();
        th.start();
    }
}

    /*Implementing Runnable interface in Java*/
    class ThreadInitializationByRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Implementing Runnable");
        }

        public static void main(String[] args) {
            ThreadInitializationByRunnable ob = new ThreadInitializationByRunnable();
            Thread th = new Thread(ob);
            th.start();
        }
    }