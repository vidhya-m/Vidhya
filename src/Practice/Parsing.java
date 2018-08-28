package Practice;
import java.util.*;

/**
 * Created by expert on 7/20/18.
 */
public class Parsing {

    public static void main(String[] args) {
        //String number="10A"; //This will show a NumberFormatException
        String number1="10";
        int result1=Integer.parseInt(number1);
        System.out.println(result1);
        Scanner s=new Scanner(System.in);
        int number2=s.nextInt();
        System.out.println(number2);
    }
}
