
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class search extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
String s=request.getParameter("n1");
 out.println("<html>");
 out.println("<head>");
 out.println("<link rel='stylesheet' href='html68.css'>");
 out.println("</head>");
 out.println("<body>");
 out.println("<div  id='mymenu'>");
out.println("<ul><li> <a href='login.html'>Home</a></li><li><a href='insert.html'>Insert</a></li><li><a href='search.html'>Search</a></li><li><a href='sa'>ShowAll</a></li><li><a href='delete.html'>Delete</a></li><li><a href='login.html'>LogOut</a></li><li>About</li><li>Contect</li></ul>");
out.println("</div>"); 

 try
 {
     Class.forName("com.mysql.cj.jdbc.Driver");    
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
 
Statement st=con.createStatement();
 String q="select * from insmarks where UROLL='"+s+"'";
 ResultSet rs=st.executeQuery(q);
 out.println("<center>");
 out.println("<form action='update'>");
 out.println("<table cellpading=12>");
  if(rs.next())
  {
     out.println("<tr>");
     out.println("<td>ROLN</td>");
     out.println("<td><input type='text' name='n1' value='"+rs.getString(1)+"'></td>");
     out.println("</tr>");
     
      out.println("<tr>");
     out.println("<td>NAME</td>");
     out.println("<td><input type='text' name='n2' value='"+rs.getString(2)+"'></td>");
     out.println("</tr>");
     
      out.println("<tr>");
     out.println("<td>PHY</td>");
     out.println("<td><input type='text' name='n3' value='"+rs.getString(3)+"'></td>");
     out.println("</tr>");
     
      out.println("<tr>");
     out.println("<td>CHE</td>");
     out.println("<td><input type='text' name='n4' value='"+rs.getString(4)+"'></td>");
     out.println("</tr>");
     
      out.println("<tr>");
     out.println("<td>MATH</td>");
     out.println("<td><input type='text' name='n5' value='"+rs.getString(5)+"'></td>");
     out.println("</tr>");
     
   out.println("<tr>");
     out.println("<th colspan='2'><input type='submit' class='B' value='UPDATE'></th>");
     out.println("</tr>");	   
  }
  else
  {
  out.println("invlaid roll no.");
  } 
  out.println("</table>");
  out.println("</form>");
 
  out.println("</center>");
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