package second;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Example {

    public static void main(String[] args) {
        LinkedList<String> Linked=new LinkedList<>();
        Linked.add("VIDHYA");
        Linked.add("ANU");
        Linked.addFirst("Vani");
        Linked.addLast("Bibin");
        Linked.add(null);
        Linked.add(null);
        Linked.removeLast();
        Linked.removeFirst();
        Linked.remove("ANU");
        Linked.remove(2);
        for(String obj:Linked){
            System.out.println(obj);
        }
    }
}
