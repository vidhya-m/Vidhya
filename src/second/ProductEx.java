package second;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


/**
 * Created by expert on 8/29/18.
 */
public class ProductEx {
    int pdt;
    int price;
    String name;

    public ProductEx(int pdt, int price, String name) {
        this.pdt = pdt;
        this.price = price;
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<ProductEx> p1=new ArrayList<>();
        p1.add(new ProductEx(10,200,"Plate"));
        p1.add(new ProductEx(30,300,"Mug"));
        p1.add(new ProductEx(20,400,"Jar"));
//        Stream<ProductEx> s=p1.stream();
//        s.filter(p -> p.price>200).forEach(x->{
//        System.out.println("pdt  "+x.pdt+" price  "+x.price+"  name "+x.name);
//        });
        List<String> productnameList2=p1.stream()
                .filter(p -> p.price>200)
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(productnameList2);
        System.out.println("*******************");
        productnameList2.stream().forEach(p-> System.out.println(p));
    }
}

