import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
class feb26 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException ,ServletException
{
  PrintWriter out=response.getWriter();
  out.println("<html>");
  out.println("<body>");
  out.println("<h1>hello sachin</h1>");
  out.println("</body>");
  out.println("</html>");
  out.close();
  
  

}

}