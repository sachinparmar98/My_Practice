import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class regis extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
   
PrintWriter out=response.getWriter();
String s1=request.getParameter("u1");
String s2=request.getParameter("u2");
String s3=request.getParameter("u3");
 out.println("<html>");
 out.println("<body>");
 try
 {

 Class.forName("com.mysql.cj.jdbc.Driver");    
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
 Statement st=con.createStatement(); 
 String q="insert into regis values('"+s1+"','"+s2+"','"+s3+"')";
 st.executeUpdate(q);
 response.sendRedirect("login.html");
con.close();
        
 }
 catch(Exception e)
 {
out.println(e);
 }
 out.println("</body>");
 out.println("</html>");
}
}