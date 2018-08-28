package DB;

import com.mysql.jdbc.*;

import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by expert on 8/3/18.
 */
public class Company {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
        Statement s = connection.createStatement();
        //Average salary of Employee
        ResultSet rs = s.executeQuery("select avg(salary) from employee");
        while (rs.next()) {
            System.out.println("Average salary: " + rs.getInt(1));
        }
        //Sorting on product name
        ResultSet rs1 = s.executeQuery("select * from product order by name asc");
        while (rs1.next()) {
            System.out.println(rs1.getInt(1) + " " + rs1.getString(2));
        }
        //Employee whose salary is greater than 15k and gender is male
        ResultSet rs2 = s.executeQuery("select * from employee where salary>15000 and gender='M'");
        while (rs2.next()){
            System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3));
        }
        //Calculate maximum salary for employee using stored procedure
        CallableStatement cs=connection.prepareCall(""+"{call getSalary(?)}");
        cs.execute();
        int x=cs.getInt(1);
        System.out.println(x);
    }
}
