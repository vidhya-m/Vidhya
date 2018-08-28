package First;
import java.util.*;

/**
 * Created by expert on 7/23/18.
 */
public class ThreadEX extends Thread {
    @Override
    public void run() {
        System.out.println("Thread in Execution");
    }

    public static void main(String[] args) {
        ThreadEX obj = new ThreadEX();
        obj.start();

        ThreadEX obj1 = new ThreadEX();
        obj1.start();
        System.out.println("Main Thread");
    }
}
