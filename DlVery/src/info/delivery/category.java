package info.delivery;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.Servlet.*;
import javax.servlet.http.*;
@SuppressWarnings({ "serial", "unused" })
public class category extends HttpServlet
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
     PreparedStatement st = con.prepareStatement("select * from goods");
     ResultSet rs=st.executeQuery();
     out.println("<p align=\"center\"> </p>");
     out.println("<p align=\"center\"> </p>");
     out.println("<div align=\"center\">");
     out.println("<table border=\"10\" align=center>");
     out.println("<tr>");
     out.println("<td><font color=\"#008000\"> goodsname</font></td>");
     out.println("<td><font color=\"#008000\"> category </font></td>");
     out.println("</tr>");
     while(rs.next())
     {
     out.println("<tr>");
     String id=rs.getString(3);  
	 String name=rs.getString(4);
     out.println("<td>"+id+"</td>");
     out.println("<td>"+name+"</td>");
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