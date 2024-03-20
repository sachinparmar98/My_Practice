
package controler;
import model.ModelDemo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControlerDemo extends HttpServlet {

    
    public  void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
           String s1=request.getParameter("u1");
           String s2=request.getParameter("u2");
           
           ModelDemo m=new ModelDemo();
           //ModelDemo.ModelDemo m=new ModelDemo.ModelDemo();
           m.setUname(s1);
           m.setUpass(s2);
           if(m.isValid())
           {
           response.sendRedirect("menu.jsp");
           }
           else
           {
           response.sendRedirect("loginhtml.jsp");
           }
           
        }
    }

  

