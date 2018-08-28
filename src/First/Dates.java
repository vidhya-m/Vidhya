package First;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.text.*;
import java.time.*;

/**
 * Created by expert on 7/24/18.
 */
public class Dates {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(date));
        System.out.println(date);
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        GregorianCalendar cal=new GregorianCalendar(); //Gregorian calendar
        int year=cal.get(Calendar.YEAR);               //Gregorian calendar
        System.out.println("Year= "+year);             //Gregorian calendar
        System.out.println(cal.getTime());             //Gregorian calendar

    }
}
