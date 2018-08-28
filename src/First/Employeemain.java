package First;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 7/10/18.
 */
public class Employeemain {
    public static void main(String[] args) {

        Employee emp1=new Employee("ann",15000,"ece");
        Employee emp2=new Employee("vidhya",16000,"cse");
        ArrayList<Employee> e1=new ArrayList<>();
        e1.add(emp1);
        e1.add(emp2);

        //for(Employee obj:e1){
        //    System.out.println(obj.empname+" "+obj.salary+" "+obj.dept);
        //}

        Iterator itr=e1.iterator();    //To iterate
        while(itr.hasNext()){  //points to the next element
            Employee obj1=(Employee)itr.next(); //typecast object to employee
            if(obj1.empname.equals("ann")){
                e1.remove(obj1);
                break;
            }
            System.out.println(obj1.empname+" "+obj1.salary+" "+obj1.dept);
        }

    }
}
