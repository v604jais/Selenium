package learningselenium;

import java.sql.*;
public class DbConnection {

	public static void main(String[] args) {
		
		 Connection conn = null;
		 
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 //String databaseName="vishal_db";
		 String userName="vishal";
		 String password="root";
		   try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   conn=DriverManager.getConnection(url, userName, password);
			   String sqlQuery="select * from emp";
			   Statement statement=conn.createStatement();
			   ResultSet result = statement.executeQuery(sqlQuery);
			   
			  while ( result.next()) {
			   System.out.println(result.getString("LAST_NAME") +result.getInt(1)); }
			   
		   }catch (Exception e) {
			   
			   System.err.println(e);
		   }finally {
			   if (conn !=null) {conn =null;}
		   }
	}

}
