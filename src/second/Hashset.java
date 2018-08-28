package second;
import java.util.*;

/**
 * Created by expert on 7/12/18.
 */
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Vidhya");
        h.add("Vani");
        h.add("Anok");
        h.add(null);
        for (String obj : h) {
            System.out.println(obj);
        }
    }
}
