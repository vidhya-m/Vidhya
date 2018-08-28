package First;
import java.util.*;

/**
 * Created by expert on 7/11/18.
 */
public class Parkingmain {
    public static void main(String[] args) {
        Parking p1 = new Parking(2, "101", 2);
        Parking p2 = new Parking(2, "102", 4);
        Parking p3 = new Parking(2, "103", 6);
        Parking p4 = new Parking(2, "103", 7);

        ArrayList<Parking> parking2 = new ArrayList<>();
        Parking.addVehicle(parking2, p1);
        Parking.addVehicle(parking2, p2);
        Parking.addVehicle(parking2, p3);
        Parking.addVehicle(parking2, p4);
        Parking.removeVehicle(parking2, "102");
        Parking.display(parking2);
    }
}
