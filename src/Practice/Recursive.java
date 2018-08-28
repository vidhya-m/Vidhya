package Practice;

/**
 * Created by expert on 7/22/18.
 */
public class Recursive {
    void display(){
        System.out.println("Hello");
        display();
    }

    public static void main(String[] args) {
        Recursive obj=new Recursive();
        obj.display();
    }
}
