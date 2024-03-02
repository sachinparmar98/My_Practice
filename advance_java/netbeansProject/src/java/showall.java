import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class showall extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
 out.println("<html>");
 out.println("<head>");
 out.println("<link rel='stylesheet' href='html68.css'>");
 out.println("</head>");
 out.println("<body>");
 out.println("<div  id='mymenu'>");
out.println("<ul><li> <a href='login.html'>Home</a></li><li><a href='insert.html'>Insert</a></li><li><a href='search.html'>Search</a></li><li><a href='sa'>ShowAll</a></li><li><a href='delete.html'>Delete</a></li><li><a href='login.html'>LogOut</a></li><li>About</li><li>Contect</li></ul>");
out.println("</div>"); 
out.println("<div id='mydata'>");
 try
 {
     Class.forName("com.mysql.cj.jdbc.Driver");    
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
 
Statement st=con.createStatement();
 String q="select * from insmarks";
 ResultSet rs=st.executeQuery(q);
 out.println("<center>");
 out.println("<table cellpadding=12>");
 out.println("<tr>");
 out.println("<td>Rno.</td>");
 out.println("<td>Name</td>");
 out.println("<td>Phys</td>");
 out.println("<td>Chem</td>");
 out.println("<td>Math</td>");
 out.println("</tr>");
  while(rs.next())
  {
	  out.println("<tr>");
	  out.println("<td>"+rs.getString(1)+"</td>");
	  out.println("<td>"+rs.getString(2)+"</td>");
	  out.println("<td>"+rs.getString(3)+"</td>");
	  out.println("<td>"+rs.getString(4)+"</td>");
	  out.println("<td>"+rs.getString(5)+"</td>");
         out.println("</tr>");
  }	  
  out.println("</table>");
  out.println("</center>");
  out.println("</div>");
 con.close();
 
 }
 catch(Exception e)
 {
     out.println(e);
 }
 out.println("</body>");
 out.println("</html>");
 out.close();
}
}