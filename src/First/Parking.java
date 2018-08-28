package First;

import java.util.*;

/**
 * Created by expert on 7/11/18.
 */
public class Parking {

    int type;
    String slotnum;
    int time;

    public Parking(int type, String slotnum, int time) {
        this.type = type;
        this.slotnum = slotnum;
        this.time = time;
    }

    public static void display(ArrayList<Parking> p){
        for(Parking obj:p){
            System.out.println(obj.slotnum+" "+obj.time);
        }
    }

    public static void addVehicle(ArrayList<Parking> p,Parking obj) {
        if (p.size() < 3) {
            p.add(obj);
        } else {
            System.out.println("All slots are occupied");
        }
    }

    public static void removeVehicle(ArrayList<Parking> p,String slotnum){
            for(Parking obj1:p){
                if(obj1.slotnum==slotnum){
                    int amt=obj1.time*10;
                    p.remove(obj1);
                    System.out.println("SLOT NUMBER "+ obj1.slotnum+" AMOUT="+amt);
                    break;
                }
            }
    }

    }

