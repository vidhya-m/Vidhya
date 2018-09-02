package second;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by expert on 8/29/18.
 */
public class StreamEx{

    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(7);
        a1.add(2);
        a1.add(4);
        a1.add(3);
        Stream<Integer> s=a1.stream();
        s.map(item->item*item).forEach(z->{
        //s.filter(x -> x>2).forEach(m->{
            // System.out.println(m);
            System.out.println(z);
        });

        ArrayList<String> al1=new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.stream().filter(e->e.contains("t")).forEach(q->{
            System.out.println(q);
        });


    }
}
