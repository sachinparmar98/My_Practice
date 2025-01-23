
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;
public class MenuDemo1 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
Cookie ck[]=request.getCookies();
if(ck!=null)
{
out.print("<html>"); 
out.print("<head>");
out.print("<link rel='stylesheet' href='html68.css'>");
out.print("</head>");
out.print("<body>");
out.print("<div  id='mymenu'>");
out.print("<ul>");
out.print("<li> <a href='login.html'>Home</a></li>");
out.print("<li><a href='insert.html'>Insert</a></li>");
out.print("<li><a href='update.html'>Search</a></li>");
out.print("<li><a href='showall.html'>ShowAll</a></li>");
out.print("<li><a href='delete.html'>Delete</a></li>");
out.print("<li><a href='logout'>LogOut</a></li>");
out.print("<li>About</li>");
out.print("<li>Contect</li>");
out.print("</ul>");
out.print("</div> ");
out.print("<center>");
out.print("WELCOME "+ck[0].getValue());
out.print("</ceter>");

out.print("</body>");
out.print("</html>");
}
else 
{
response.sendRedirect("login.html");
}
out.close();
}
}