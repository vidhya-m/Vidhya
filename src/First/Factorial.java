package First;
import java.util.*;

/**
 * Created by expert on 7/26/18.
 */
public class Factorial {
    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return (n*factorial(n-1));
    }

    public static void main(String[] args) {
        System.out.println("Number");      //Console input
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(factorial(num));
        //System.out.println(factorial(5));   //Manual input
    }
}
