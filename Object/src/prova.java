import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.beans.Statement;
import java.sql.Connection;
public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1 = "jdbc:postgresql://localhost:5432/Market";
        String user = "postgres";
        String password = "admin";
        try (Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Market","postgres", "admin");) {
    		if(connection !=null) {
    			System.out.println("Connected  to the server");
    		}
    		else {
    			System.out.println("fallito");
    		}
    		
    		Statement st=(Statement) connection.createStatement();
    		
    		
    		
    	} catch (SQLException e ) {
    		e.printStackTrace();
    	}
        
        
        
        
        
        
      
	}







}