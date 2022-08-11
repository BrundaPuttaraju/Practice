package org.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
		
	public static void main(String args[]){  
		try{  
			
		//Register the driver class

		Class.forName("com.mysql.jdbc.Driver");  
		
		//Create the connection object - Get connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sa","root","root");  
		//here sonoo is database name, root is username and password  
		
		//Create the Statement object

		Statement stmt=con.createStatement(); 
		
		//Execute the query
		
		/*ResultSet rs=stmt.executeQuery("select * from student");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		
		*/
		PreparedStatement stmt1=con.prepareStatement("insert into student values(?,?,?)");  
		stmt1.setInt(1,116);//1 specifies the first parameter in the query  
		stmt1.setString(2,"ABC");
		stmt1.setString(3, "XYZ");
		  
		int i=stmt1.executeUpdate();  
		System.out.println(i+" record inserted");

		
		//Close the connection object
		
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
	} 


