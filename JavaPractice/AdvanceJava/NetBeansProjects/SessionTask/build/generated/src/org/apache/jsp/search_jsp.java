package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menucommon.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <rel stayle=\"stylesheet\" href=\"html68.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div  id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li> <a href=\"loginhtml.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"inserthtml.jsp\">Insert</a></li>\n");
      out.write("<li><a href=\"search.jsp\">Search</a></li>\n");
      out.write("<li><a href=\"search.jsp\">Update</a></li>\n");
      out.write("<li><a href=\"showall.jsp\">ShowAll</a></li>\n");
      out.write("<li><a href=\"delete.jsp\">Delete</a></li>\n");
      out.write("<li><a href=\"logout.jsp\">LogOut</a></li>\n");
      out.write("<li>About</li>\n");
      out.write("<li>Contect</li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <div id=\"mydata\">\n");
      out.write("            <center>\n");
      out.write("                <form action=\"search.jsp\" >\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Enter Roll No.</td>\n");
      out.write("                            <td><input type=\"text\" class=\"A\" name=\"u1\" placeholder=\"enter password\"></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <th colspan=\"2\"><input type=\"submit\" name=\"b1\" value=\"SEARCH\" class=\"B\"><th>\n");
      out.write("                            </tr>\n");
      out.write("                    </table>>\n");
      out.write("          \n");
      out.write("        ");

            String s1=request.getParameter("u1");
            String B1=request.getParameter("b1");
            if(B1!=null)
            {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
                Statement st=con.createStatement();
                String q="select * from insmarks wheher UID='"+s1+"'";
                ResultSet rs=st.executeQuery(q);
                
                if(rs.next())
                {
               
      out.write("\n");
      out.write("               <form action=\"search.jsp\">\n");
      out.write("               <table cellpadding=\"12\">\n");
      out.write("                   <tr>\n");
      out.write("                       <td>Roll No.</td>\n");
      out.write("                       <td><input type=\"text\" class=\"B\" name=\"n1\" value=\"");
      out.print(rs.getString(1));
      out.write("\"></td>\n");
      out.write("                   </tr>\n");
      out.write("                   </table>\n");
      out.write("                   </form>\n");
      out.write("               ");

                }
                else
                {
                out.print("invld roll no.");
                }  
            }
            catch(Exception e)
            {
            }
            }
            
      out.write("\n");
      out.write("                 </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
