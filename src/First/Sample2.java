package First;

/**
 * Created by expert on 7/24/18.
 */
public class Sample2 {
    protected void finalize() throws Throwable{//finalize runs before garbage collection
        System.out.println("before garbage collection");
    }
    int x;

    public static void main(String[] args) {
        System.gc(); //finalize runs with this//Calls garbage collector and destroys the object
        //Runtime.getRuntime().gc();
        Sample2 s=new Sample2();
        s=null;
        Sample2 s1=new Sample2();
        s1=null;
        System.gc();
    }
}
