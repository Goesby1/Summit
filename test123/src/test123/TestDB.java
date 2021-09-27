package test123;

import java.sql.*;

public class TestDB 
{
	public static void main(String[] args) throws Exception
	{
	
	// load the driver, driver of  mysql db.	
	//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
	// create connection object for given db.
	Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ "examplejpa","root","root");
    System.out.println("---connected---");
    c1.close();
}
}
