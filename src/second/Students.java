package second;
import java.util.*;

/**
 * Created by expert on 7/12/18.
 */
public class Students implements Comparable<Students> {

    int rollno;
    String name;
    int age;

    public Students(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        TreeSet<Students> ts = new TreeSet<>();
        ts.add(new Students(2, "Vidhya", 24));
        ts.add(new Students(12, "Vani", 14));
        ts.add(new Students(6, "Reshma", 25));

        Iterator itr=ts.iterator();
        while(itr.hasNext()){
            Students obj=(Students) itr.next();
            System.out.println("Rollno "+obj.rollno+" Name "+obj.name+" Age "+obj.age);
        }


    }

    @Override
    public int compareTo(Students o) {
        if (rollno > o.rollno) {
            return 1;
        } else if (rollno < o.rollno) {
            return -1;
        } else {
            return 0;
        }
    }
}
