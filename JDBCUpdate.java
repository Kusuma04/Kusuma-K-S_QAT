package test_sql;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPD1";
		String username = "SYSTEM";
		String password = "Kusuma@04";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Created");
		Statement stmt = con.createStatement();
		
		String updateQuerry = "Update ID=3 where name = 'ANANYA'";
		stmt.executeUpdate(updateQuerry);
		
		ResultSet rs = stmt.executeQuery("SELECT *FROM STUDENTSSS");
	    System.out.println("Querry Executiobn"+rs);
	    
	    while(rs.next()){
	    	System.out.println(rs.getString("ID")+" "+rs.getString("NAME")+" "+rs.getString("DOB"));
	  
	}
		con.close();

	}

}
