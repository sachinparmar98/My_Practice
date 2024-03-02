
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class update extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
String s1=request.getParameter("n1");
String s2=request.getParameter("n2");
String s3=request.getParameter("n3");
String s4=request.getParameter("n4");
String s5=request.getParameter("n5");
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
 String q="update insmarks set UNAME='"+s2+"',PHYMARK='"+s3+"', CHEMARK='"+s4+"', MATHMARK='"+s5+"' where UROLL='"+s1+"'";
 st.executeUpdate(q);
 response.sendRedirect("showall");
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