package second;
import java.util.*;

/**
 * Created by expert on 7/12/18.
 */
public class Linkedhash {
    public static void main(String[] args) {
        LinkedHashSet<String> h = new LinkedHashSet<>();
        h.add("Vidhya");
        h.add("Vani");
        h.add("Anok");
        h.add(null);
        for (String obj : h) {
            System.out.println(obj);
        }
    }
}