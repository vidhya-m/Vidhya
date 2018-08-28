package second;
import java.util.*;

/**
 * Created by expert on 7/12/18.
 */
public class Book {
    String name;
    float price;
    String author;

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args) {
        LinkedList<Book> b=new LinkedList<>();
        Book b1= new Book("adsf",12,"sdsd");
        Book b2= new Book("adse",200,"sd");
        Book b3= new Book("aeef",20,"xccxv");
        b.add(b1);
        b.add(b2);
        b.add(b3);

        Iterator itr=b.iterator();
        while(itr.hasNext()){
            Book obj=(Book)itr.next();
            if(b.contains(b2)){
                b2.price=100;
            }
            System.out.println("Name "+obj.name+" Price "+obj.price+" Author "+obj.author);

        }




    }

}
