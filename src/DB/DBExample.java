package DB;
import java.util.*;
import java.sql.*;

/**
 * Created by expert on 8/2/18.
 */
public class DBExample {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        PreparedStatement ps=connection.prepareStatement("select * from student where id=?");
        ps.setInt(1,2);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
            }

        CallableStatement cs=connection.prepareCall(""+"{call getStudent(?,?,?)}");
        cs.setInt(1,4);
        cs.setString(2,"hbhj");
        cs.registerOutParameter(3,Types.INTEGER);
        cs.execute();
//        ResultSet rs1=cs.getResultSet();
//        while(rs1.next()){
//            System.out.println(rs1.getInt("id")+" "+rs1.getString("name"));
//        }
        int x=cs.getInt(3);
        //or
        int y=cs.getInt("total");
        System.out.println(y);
        connection.close();


    }
}

