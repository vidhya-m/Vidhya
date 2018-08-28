package Practice;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
/**
 * Created by expert on 7/20/18.
 */
public class Circle1 {
    int radi;
    final double pi = 3.14159;
    double area, circumference;


//    void areac() {
//        double area = pi * radi * radi;
//        System.out.println("Area of the circle is = "+area);
//    }

    double areac() {
        double area = pi * radi * radi;
        System.out.println("Area of the circle is = "+area);
        return area;
    }

    double circumference(int x) {
//        double circumference = 2* pi * radi;
//        System.out.println("Circumference of the circle is = "+circumference);
        return 2* pi * x;
    }

    double show(double a,double b) {
        System.out.println(a+" "+b);
        return a;
    }

    public static void main(String[] args) {
        Circle1 obj = new Circle1();
        System.out.println("Enter the radius : ");  // Giving console input
        Scanner s=new Scanner(System.in);
        obj.radi=s.nextInt();
        //obj.radi = 3;    // assign value
        obj.areac();
        double n=obj.area;
        obj.circumference(5);
        System.out.println("Circumference of the circle is = "+obj.circumference(5));
        obj.show(obj.circumference(3),obj.areac());
        //System.out.println(obj.show());
    }
}