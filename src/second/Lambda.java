package second;

/**
 * Created by expert on 8/29/18.
 */
interface Drawable{
    //public void draw();
    public void draw(String name,int z);
} Drawable d2=(x,y)->{
    System.out.println("Drawing "+width+" Name "+x+" y = "+y);
};
public class Lambda {
    public static void main(String[] args) {
        int width=10;
        //with Lambda
//        Drawable d1=()->{
//            System.out.println("Drawing " +width);
//        };
        //d1.draw();

        d2.draw("square",2);
    }

}
