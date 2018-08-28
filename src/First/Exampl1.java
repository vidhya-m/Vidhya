package First;
import java.util.*;

/**
 * Created by expert on 7/10/18.
 */
public class Exampl1 {
    public static void main(String[] args) {
        //generic declarations
        ArrayList<String> al = new ArrayList();
        al.add("Vidhya");
        al.add("Anju");
        al.add("Vani");
        al.add("Vidhya");
        al.add("null");
        for (String obj : al) {
            System.out.println(obj);
        }
        //List<String> al1=new ArrayList<>();
        //ArrayList<String>al2=new ArrayList<String>();
        ArrayList<Integer> b1 = new ArrayList();
        b1.add(1);
        b1.add(2);
        b1.add(1);
        for (Integer obj1 : b1) {
            System.out.println(obj1);
        }

        Iterator itr=al.iterator();    //To iterate
        while(itr.hasNext()){  //points to the next element
            System.out.println(itr.next());
        }
        for(int i=0;i<al.size();i++){    //size is to get length
            System.out.println(al.get(i)); //Index based iteration
        }

        ArrayList<String> a1 = new ArrayList();
        a1.add("apple");
        a1.add("orange");
        a1.add("grapes");
        al.addAll(1,a1);  //Merging arrays
        al.remove("Vani");
        al.remove(3);
        for(String obj3:al){
            System.out.println(obj3);
        }


    }
}