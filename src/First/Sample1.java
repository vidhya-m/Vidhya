package First;

/**
 * Created by expert on 7/23/18.
 */
 public class Sample1 {
    //synchronized public void display(int x){ //synchronized method
    static synchronized public void display(int x) { //synchronized class
        //synchronized (this) {    //synchronized block
            for (int i = 0; i < 3; i++)
                System.out.println(i * x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        //}
        System.out.println("Rest of the code"+Thread.currentThread().getName());
    }
 }


