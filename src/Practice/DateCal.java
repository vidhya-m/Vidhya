package Practice;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

/**
 * Created by expert on 7/21/18.
 */
public class DateCal {

    public static void main(String[] args) {


//        Date today;
//        SimpleDateFormat sdf;
//        sdf=new SimpleDateFormat("dd/MM/yyyy");
//        today=new Date();
//        System.out.println(sdf.format(today));
//        System.out.println(today);
////       System.out.println(today.toString());
        Date date = new Date();
        GregorianCalendar cal=new GregorianCalendar(); //Gregorian calendar
        int year=cal.get(Calendar.YEAR);               //Gregorian calendar
        System.out.println("Year= "+year);             //Gregorian calendar
        System.out.println(cal.getTime());             //Gregorian calendar
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
        try {
            Date st1 = sdf.parse("05/30/1993");
            System.out.println(st1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String st = sdf.format(date);
        System.out.println(st);
    }

}

