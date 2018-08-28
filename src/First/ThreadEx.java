package First;
import java.util.*;

/**
 * Created by expert on 7/23/18.
 */
public class ThreadEx implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread in Execution");
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadEx obj = new ThreadEx();
        Thread t=new Thread(obj);
        t.start();
        Thread t1=new Thread(obj);
        t1.start();
        System.out.println("Main Thread");
    }
}
