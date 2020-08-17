package info.delivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class update {
	public static boolean match(String name, String pass)
	{
		boolean status=false;
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dlvery","root","password");
			PreparedStatement ps=con.prepareStatement("select * from emp_details where eid=? and epassword=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  		      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		return status;
	}

}
