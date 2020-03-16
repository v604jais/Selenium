package learningselenium;

import java.sql.*;

public class practise {

	public static void main(String[] args) throws Exception {
		
		Connection conn=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userName="vishal";
		String Password="root";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, userName, Password);
			Statement st=conn.createStatement();
			String sqlQuery="select * from emp";
			ResultSet result=st.executeQuery(sqlQuery);
			
			while (result.next()) {
		     System.out.println(result.getInt(1));  
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if (conn!=null) {conn=null;}
		}

	}

}
