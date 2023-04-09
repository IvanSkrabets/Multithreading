import java.util.concurrent.Semaphore;

public class User {
    private volatile int a = 1;

    public void sayHello() {
        synchronized (this){
            System.out.println("Hello");
        }
//       new Semaphore (5);
    }
}
