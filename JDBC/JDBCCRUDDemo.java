import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JDBCCRUDDemo {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int opt;
		do {
			System.out.println("1. Insert a new Record(C)");
			System.out.println("2. Read all records(R)");
			System.out.println("3. Update any record(U)");
			System.out.println("4. Delete any record(D)");
			System.out.println("9.Exit");
			System.out.println("Enter your option : ");
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				insertRecord();
				break;
			case 2:
				readRecord();
				break;
			case 3:
				updateRecord();
				break;
			case 4:
				deletRecord();
				break;
			case 9:
				break;
			default:
				System.out.println("Wrong option");
				break;

			}
		} while (opt != 9);
	}

	private static void deletRecord() {
		try {
			Connection con = getConnection();
			String qry = "delete from employees where id=?";
			PreparedStatement pstmt = con.prepareStatement(qry);

			System.out.println("Enter the id to delete ");
			int i = sc.nextInt();
			pstmt.setInt(1, i);
			pstmt.executeUpdate();
			System.out.println(" Record deleted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void updateRecord() {
		try {
			Connection con = getConnection();
			String qry = "update employees set name=? , age=? where id=?";
			PreparedStatement pstmt = con.prepareStatement(qry);

			System.out.println("Enter the id to update ");
			int i = sc.nextInt();

			System.out.println("Enter the new name ");
			String n = sc.next();

			System.out.println("Enter the new age ");
			int a = sc.nextInt();

			pstmt.setString(1, n);
			pstmt.setInt(2, a);
			pstmt.setInt(3, i);

			pstmt.executeUpdate();
			System.out.println(" Record updated");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void readRecord() {
		try {
			Connection con = getConnection();
			String qry = "select * from employees";
			PreparedStatement pstmt = con.prepareStatement(qry);
			ResultSet rs = pstmt.executeQuery();
			ArrayList<Employees> emplist = new ArrayList<>();

			while (rs.next()) {
				// System.out.println(rs.getInt(1)+ rs.getString(2)+ rs.getInt(3));
				// System.out.println(rs.getInt("id")+" " + rs.getString("name")+ " " +
				// rs.getInt("age"));
				int i = rs.getInt(1);
				String n = rs.getString(2);
				int a = rs.getInt(3);
				Employees e1 = new Employees(i, n, a);
				emplist.add(e1);
			}
			// System.out.println(emplist);

			Iterator<Employees> i1 = emplist.iterator();
			while (i1.hasNext()) {
				System.out.println(i1.next());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void insertRecord() {
		try {
			Connection con = getConnection();
			String qry = "insert into employees values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(qry);

			System.out.println("Enter the employee id, name and age ");
			int i = sc.nextInt();
			String n = sc.next();
			int a = sc.nextInt();

			pstmt.setInt(1, i);
			pstmt.setString(2, n);
			pstmt.setInt(3, a);

			pstmt.executeUpdate();
			System.out.println(" Record inserted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static Connection getConnection() {
		Connection con = null;
		try {
			// Step 1 Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2 Create Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}