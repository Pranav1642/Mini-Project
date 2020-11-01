package hotel.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  //using a constructor with the same name
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///hms","root","12345678"); 
            
            s = c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

