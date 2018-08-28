package First;
import static java.lang.Math.*;
import java.util.*;

/**
 * Created by expert on 7/26/18.
 */
public class MathSample {
    public static void main(String[] args) {
        System.out.println(abs(-10.05));//Math.abs if there is no static in import stmt
        System.out.println(max(20,60));
        System.out.println(pow(2,3));
        Random random=new Random();
        int i=random.nextInt(10);
        System.out.println(i);

    }

}

