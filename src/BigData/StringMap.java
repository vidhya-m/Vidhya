package BigData;
import java.util.*;
import java.lang.String;

/**
 * Created by expert on 9/3/18.
 */
public class StringMap {
    public static void main(String[] args) {
        //Give value as 1 to the keys(keys are words in the sentence)
        Map<String, Integer> map = new HashMap<>();
        String s = "hai hello how are you";
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            map.put(a[i],1);
        }
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }

        }

    }