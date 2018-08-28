package Practice;

/**
 * Created by expert on 7/20/18.
 */
public class Static1 {
    int count=0; //will get memory every time instance is created
    //static int count=0; //will get memory only once and will retain its value
    Static1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Static1 obj1=new Static1();
        Static1 obj2=new Static1();
        Static1 obj3=new Static1();
    }
}
