package com.example.singletontest;

//Singleton without Spring boot 
class Connection {
	static Connection con; 
	
	private Connection ()
	{
		
	}
	
	public static Connection getConnection( )
	{
		if (con == null) {
			con = new Connection();
			return con;
		}
		return con;
		
	}
	
}
public class SingletonTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();
		Connection c3 = Connection.getConnection();
		 
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

	}

}
