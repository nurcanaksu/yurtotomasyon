
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nurcan
 */
public class dbHelper {
        private final String url="jdbc:postgresql://localhost:5432/newdatabase";
        private final String user= "postgres";
        private final String password="123";
     
    
   public Connection getConnection() throws SQLException
    {
         return DriverManager.getConnection(url,user,password);
    }
   
    public void showErrorMessage(SQLException exception)
    {
        System.out.println("error: " + exception.getMessage());
        System.out.println("error code: " +exception.getErrorCode());
    }
}




