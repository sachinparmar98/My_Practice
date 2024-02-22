import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class login extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
String s1=request.getParameter("u1");
String s2=request.getParameter("u2");
 out.println("<html>");
 out.println("<body>");
 try
 {
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql:///schoolmanagment","root","root");
 Statement st=con.createStatement();
 String q="select * from regis where UID='"+s1+"' AND UPASS='"+s2+"' ";
 st.executeQuery(q);
 response.sendRedirect("welcome.html");
 con.close();
 
 }
 catch(Exception e)
 {
 }
 out.println("</body>");
 out.println("</html>");
}
}