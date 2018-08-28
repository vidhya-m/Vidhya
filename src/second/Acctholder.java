package second;
import java.util.*;

/**
 * Created by expert on 7/4/18.
 */
public class Acctholder extends Bank {
    int accno;
    String name;
    float amount;

    public Acctholder(String bankname, int ifsc, String branch, int accno, String name, float amount) {
        super(bankname, ifsc, branch);
        this.accno = accno;
        this.name = name;
        this.amount = amount;
    }

    public static void display(ArrayList<Acctholder> ah) {

        for (Acctholder obj : ah) {
            System.out.println("Bankname:  " + obj.bankname + " IFSC:  " + obj.ifsc + " Branch:  " + obj.branch + " Account no: " + obj.accno + "  Accountholder: " + obj.name + "  Amount: " + obj.amount);
        }
    }

    public static void display(int accno, ArrayList<Acctholder> ah) {
        for (Acctholder obj : ah) {
            if (obj.accno == accno)
            System.out.println("Accno: " + obj.accno + " name: " + obj.name + " Amount: " + obj.amount);
        }

    }


    public static void deposit(int accno,int amount,ArrayList<Acctholder> ah){

        for(Acctholder obj:ah){
            if(obj.accno==accno){
                obj.amount+=amount;
                System.out.println("Accno: "+obj.accno+" Balance: "+obj.amount);
            }
        }
    }


    public static void retrieve(int accno,int amount,ArrayList<Acctholder> ah){
        for(Acctholder obj:ah){
            if(obj.accno==accno){
                obj.amount-=amount;
                System.out.println("Accno: "+obj.accno+" Balance: "+obj.amount);
            }
        }

    }

    public static void remov(int accno,ArrayList<Acctholder> ah){

        for(Acctholder obj:ah){
            if(obj.accno==accno) {
                ah.remove(obj);
                break;
            }
            Iterator itr=ah.iterator();    //To iterate
            while(itr.hasNext()){  //points to the next element
                Acctholder obj1=(Acctholder)itr.next(); //typecast object to employee

                System.out.println("Accno: "+obj1.accno+" Balance: "+obj1.amount);
                }
            }
        }

    public static void main(String[] args) {
        Acctholder a=new Acctholder("SBI",1111,"kottayam",1000,"Angel",5000f);
        Acctholder a1=new Acctholder("Federal",2222,"Ekm",2000,"Ram",900f);
        Acctholder a2=new Acctholder("Axis",3333,"Alapuzha",3000,"anju",40021f);

        ArrayList <Acctholder>ah=new ArrayList<>();
        ah.add(a1);
        ah.add(a2);
        ah.add(a);
        display(ah);
        display(2000,ah);
        deposit(1000,10,ah);
        retrieve(3000,10,ah);
        remov(1000,ah);
    }
}


