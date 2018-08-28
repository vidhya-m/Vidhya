package Practice;

/**
 * Created by expert on 7/20/18.
 */
public class Static {

    public void display(){
        System.out.println("Non-static method");
    }

    static void show(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        show();
        Static obj=new Static();
        obj.display();
    }
}
