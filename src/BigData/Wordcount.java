package BigData;

/**
 * Created by expert on 9/3/18.
 */
public class Wordcount {
    public static void main(String[] args) {
        //Word count using array
        String inp = "Hai Ram it is big data and hadoop is there to handle it";
        String[] dups = inp.split(" ");
        int wrc = 1;
        for (int i = 0; i < dups.length; i++) {
            for (int j = i + 1; j < dups.length; j++) {

                if (dups[i].equals(dups[j])) {
                    wrc = wrc + 1;
                    dups[j] = "0";
                }
            }
                if (dups[i] != "0")
                    System.out.println(dups[i] + "->" + wrc);
                wrc = 1;

            }

        }
    }


