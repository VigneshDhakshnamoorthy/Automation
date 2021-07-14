package database_test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database_test_1 {
    public static void main(String[] args) {
    	
    	String server = "192.168.137.15";
    	String port = "1433";
    	String database = "Shopping_Zone";
    	String table_name = "dbo.f_scheme_master";
    	String username = "sa";
    	String password = "manoj.111";

      //  String connectionUrl = "jdbc:sqlserver://192.168.137.15:1433;databaseName=Shopping_Zone;user=sa;password=manoj.111";
       
    //  	String SQL = "SELECT * FROM Shopping_Zone.dbo.f_scheme_master";
    	
    	
        String connectionUrl ="jdbc:sqlserver://"+server+":"+
        						port+
        						";databaseName="+database+
        						";user="+username+
        						";password="+password;

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            
    
            
        	String SQL = "SELECT * FROM "+database+"."+table_name;
            
            ResultSet rs = stmt.executeQuery(SQL);


          while (rs.next()) {
        	  if (rs.getDouble("ORIGINAL_PRICE") > 0 && rs.getString("SCHEME_NAME").contains("ANDROID")) {
                System.out.println(rs.getString("SCHEME_NAME")+" - "+rs.getDouble("ORIGINAL_PRICE"));
            
        	  }
        	  }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}