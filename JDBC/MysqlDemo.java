import java.sql.*;

class MysqlDemo{

	public static void main(String args[]){

		try{

//			Class.forName("com.mysql.jdbc.Driver");  // this is deprecated
			Class.forName("com.mysql.cj.jdbc.Driver");
//step 2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zomato","root","root");

			//here zomato is database name, root is username and password
//step 3
			Statement stmt = con.createStatement();
			
			
//			step 4
			ResultSet rs = stmt.executeQuery("select * from orders");

			while(rs.next ()) 

				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3) +rs.getString(4));

			
//			con.close();
		}catch(Exception e){ System.out.println(e);}

	}

}