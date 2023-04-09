//Thread
//Runnable

import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    private AtomicInteger ai = new AtomicInteger();
    private Integer i = 2;


    public void test(){
        Vector<String> a =new Vector<>();
        Hashtable<String, String> b = new Hashtable<>();

        CopyOnWriteArrayList<String> c =new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, String> d =new ConcurrentHashMap<>();

        int i1 = ai.incrementAndGet();
    }
    public static void main(String[] args) {
//        Thread thread = new SomeThread();
//        Thread thread1 = new SomeThread();
//        thread.start();
//        thread1.start();
//        for(int i = 0; i < 100; i++) {
//            System.out.println("main" + "" + i);
//        }
        Thread thread = new Thread(new SomeRun());
        Thread thread2 = new Thread(new SomeRun());
        thread2.setDaemon(true);
        thread2.setPriority(10);
        thread2.setName("dlfd");
        thread.start();
        thread2.start();
    }
}

