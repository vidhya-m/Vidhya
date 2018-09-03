package BigData;
import java.lang.*;

/**
 * Created by expert on 9/3/18.
 */
public class Stringsplit {
    public static void main(String[] args) {
        //Append one to each word in the sentence
        String inp="Hai Ram it is big data and hadoop is there to handle it";
        String[] dups=inp.split(" ");
        for(String d:dups){
            System.out.println(d+"1");
        }
    }
}
