package info.delivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dupdate {
	public static boolean match(String id)
	{
		boolean status=false;
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dlvery","root","password");
			PreparedStatement ps=con.prepareStatement("delete from emp_details where eid=?");  
			ps.setString(1,id);  
			int x=ps.executeUpdate();
			if(x==1)
			{
				System.out.print("updated");
				status=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		return status;
	}

}