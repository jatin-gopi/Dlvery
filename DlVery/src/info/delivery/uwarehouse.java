package info.delivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class uwarehouse {
	public static boolean match(String id, String name,String phno,String dept,String pass)
	{
		boolean status=false;
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dlvery","root","password");
			PreparedStatement ps=con.prepareStatement("Insert into warehouse(eid,gid,goodsname,InTiming,OutTiming) values(?,?,?,?,?,?)");  
			ps.setString(1,id);  
			ps.setString(2,name);
			ps.setString(3,phno);
			ps.setString(4,dept);
			ps.setString(5,pass);
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