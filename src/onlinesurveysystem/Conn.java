
package onlinesurveysystem;

/**
 *
 * @author Mintu's PC
 */
import java.sql.*;

public class Conn {
    Connection c;
   Statement s;
   Conn() {
     
       try{
           c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinesurveysystem", "root", "");  
           s = c.createStatement();
       } catch(Exception e){
           e.printStackTrace();
       }
   }
}
