
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
public class logout extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    Cookie ck=new Cookie("cookiename","");
    ck.setMaxAge(0);
    response.addCookie(ck);
    response.sendRedirect("login.html");
        
}
}
