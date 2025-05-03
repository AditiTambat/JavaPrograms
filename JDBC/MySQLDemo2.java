import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLDemo2 {
	public static void main(String[] args) {
//		step 1 register the driver
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
//		step 2 create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
//		step 3 create statement
		Statement stmt = con.createStatement();
		
		
//		step 4 execute queries
		
		stmt.executeUpdate(" insert into employees values(1,'Aditi', 22)");
		stmt.executeUpdate(" insert into employees values(2,'Radha', 22)");
		
		
//		step 5 close connection
		
//		con.close();
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
