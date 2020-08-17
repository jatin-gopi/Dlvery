package info.delivery;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.Servlet.*;
import javax.servlet.http.*;
@SuppressWarnings({ "serial", "unused" })
public class employeinfo extends HttpServlet
{
     public void doPost(HttpServletRequest request,HttpServletResponse response)
     throws IOException,ServletException
     {
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
     try
     {
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dlvery","root","password");
     PreparedStatement st = con.prepareStatement("select * from emp_details");
     ResultSet rs=st.executeQuery();
     out.println("<p align=\"center\"> </p>");
     out.println("<p align=\"center\"> </p>");
     out.println("<div align=\"center\">");
     out.println("<table border=\"10\" align=center>");
     out.println("<tr>");
     out.println("<td><font color=\"#008000\"> id </font></td>");
     out.println("<td><font color=\"#008000\"> name </font></td>");
     out.println("<td><font color=\"#008000\"> Phone No </font></td>");
     out.println("<td><font color=\"#008000\"> Department </font></td>");
     out.println("<td><font color=\"#008000\"> Password </font></td>");
     out.println("</tr>");
     while(rs.next())
     {
     out.println("<tr>");
     String id=rs.getString(1);  
	 String name=rs.getString(2);
	 int phno=rs.getInt(3);
	 String dept=rs.getString(4);
	 String pass=rs.getString(5);
     out.println("<td>"+id+"</td>");
     out.println("<td>"+name+"</td>");
     out.println("<td>"+phno+"</td>");
     out.println("<td>"+dept+"</td>");
     out.println("<td>"+pass+"</td>");
     out.println("</tr>");
     }
     out.println("</table>");
     out.println("</center>");
     out.println("</div>");
     }
     catch(Exception e)
     {
     System.out.println(e);
     }
     out.println("<h1 align=center><a href='Home.html'>Return to page</a><h1>");
     }
}