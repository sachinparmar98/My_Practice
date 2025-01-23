import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServerDemo2 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
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
	String q="insert into login values ('"+s1+"','"+s2+"')";
	st.executeUpdate(q);
	out.println("<h2>data inserted by SACHIN PARMAR</h2>");
	con.close();
}
catch(Exception e)
{
	out.println("<h1>e</h1>");
}
out.println("</body>");
out.println("</html>");
out.close();
}
}