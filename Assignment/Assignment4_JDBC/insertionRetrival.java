package Assignment4_JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class insertionRetrival{
	public static void main(String args[])throws Exception {
	      //Registering the Driver
		  Driver myDriver = new com.mysql.jdbc.Driver();
	      DriverManager.registerDriver(myDriver);
	      //Getting the connection
	      //String mysqlUrl = "jdbc:mysql://localhost:3306/jdbc_demo";
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Ss@1234");
	      System.out.println("Connection established......");
	      //Creating a Statement object
	      Statement stmt = con.createStatement();
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number of records you need to insert: ");
	      int num = sc.nextInt();
	      //Inserting values to the table
	      String query = "INSERT INTO employee_data VALUES (?, ?, ?, ?, ?, ?)";
	      PreparedStatement pstmt = con.prepareStatement(query);
	      for(int i=1; i<=num; i++) {
	         System.out.println("Enter the Employee name: ");
	         String name =sc.next();
	         System.out.println("Enter the Employee address: ");
	         String address =sc.next();
	         System.out.println("Enter the Employee gender: ");
	         String gender =sc.next();
	         System.out.println("Enter the Employee DOB in the format dd-MM-yyyy : ");
	         String dateOfBirth = sc.next();
	         System.out.println("Enter the Employee DOJ in the format MM-dd-yyyy : ");
	         String dateOfJoining = sc.next();
	         System.out.println("Enter the Employee DOM in the format yyyy-MM-dd : ");
	         String dateOfManufacturer = sc.next();
	         pstmt.setString(1,name);
	         pstmt.setString(2, address);
	         pstmt.setString(3, gender);
	         pstmt.setDate(4, Date.valueOf(dateOfBirth));
	         pstmt.setDate(5, Date.valueOf(dateOfJoining));
	         pstmt.setDate(6, Date.valueOf(dateOfManufacturer));
	         pstmt.executeUpdate();
	      }
	      System.out.println("data inserted");
	      //Creating Statement object
	      stmt = con.createStatement();
	      ResultSet rs = stmt.executeQuery("select * from employee_data");
	      //Retrieving values
	      while(rs.next()) {
	         System.out.println("Employee_Name: "+rs.getString("Name"));
	         System.out.println("Employee_Address: "+rs.getString("Address"));
	         System.out.println("Employee_Gender: "+rs.getString("Gender"));
	         System.out.println("Employee_DOB: "+rs.getInt("DOB"));
	         System.out.println("Employee_DOJ: "+rs.getInt("DOJ"));
	         System.out.println("Employee_DOM: "+rs.getInt("DOM"));
	         System.out.println();
	      }
	   }
}
