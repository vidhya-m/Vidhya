package second;
import java.util.*;

/**
 * Created by expert on 7/12/18.
 */
public class Tree {
    public static void main(String[] args) {

        TreeSet<String> h = new TreeSet<>();
        h.add("Vidhya");
        h.add("Vani");
        h.add("Anok");
        h.add("Vani");
        //h.add(null);   null cannot be accepted
        for (String obj : h) {
            System.out.println(obj);
        }
    }
}
