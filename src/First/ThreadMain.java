package First;

/**
 * Created by expert on 7/23/18.
 */

class Thread1 extends Thread{
    Sample1 s;
    Thread1(Sample1 s){
        this.s=s;
    }
    @Override
    public void run() {
       s.display(40);
    }
}

class Thread2 extends Thread{
    Sample1 s;
    Thread2(Sample1 s){
        this.s=s;
    }
    @Override
    public void run() {
        s.display(20);
    }
}
public class ThreadMain {
    public static void main(String[] args) {
        Sample1 s = new Sample1();
        Thread1 t = new Thread1(s);
        Thread2 t1 = new Thread2(s);
        t.start();
        t1.start();
        Sample1 s1=new Sample1();
        Thread1 t2 = new Thread1(s1);
        Thread2 t3 = new Thread2(s1);
        t2.start();
        t3.start();
    }
}
