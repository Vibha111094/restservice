package org.vibha.test.test003;
import java.sql.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("create")
public class dbconn {
	
	//public Connection dbcon;
	//static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	  // static final String DB_URL = "jdbc:mysql://localhost:3306/user";

	   //  Database credentials
	   
	   //static final String USER = "root";
	   //static final String PASS = "";
	   @GET
	   public  int create_Func() {

		  Connection dbcon;
			 String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			 String DB_URL = "jdbc:mysql://localhost:3306/user";

			   //  Database credentials
			   
			   String USER = "root";
			   String PASS = "";
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "INSERT INTO user_info VALUES ('raovsjdfjsd.com','9629972767836vibha',9972767836,'#346,25th,cross','zoya','prasad')";
	      stmt.executeUpdate(sql);
	      
	      System.out.println("Inserted records into the table...");

	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	      return 1;
	   }


//end try
	 //  System.out.println("Goodbye!");
	//}//end main
		  //
	   
	 }
}

