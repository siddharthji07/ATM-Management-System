
package bank.management.system;
import java.sql.*;

public class Conn {
    
    Connection c;   //declaration of global variable of  connection c
    Statement s;    // declartion of global statment of variable
    
    public Conn() {
        try {       // my sql is a external entity, thats why to catch the compile time error we use exception handling
            
            // to register ,the driver class we use whose name is class in which we write our driver name, but once we add mysql connector then no need of this line
            
            
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","9876543210");    
            s =c.createStatement(); 
           
            
            System.out.println("Connected to the database!"); // Print success message
        } catch(Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
}

