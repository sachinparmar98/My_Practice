package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inserthtml_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"html68.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div  id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li> <a href=\"loginhtml.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"inserthtml.jsp\">Insert</a></li>\n");
      out.write("<li><a href=\"update.jsp\">Search</a></li>\n");
      out.write("<li><a href=\"showall.jsp\">ShowAll</a></li>\n");
      out.write("<li><a href=\"delete.jsp\">Delete</a></li>\n");
      out.write("<li><a href=\"logout.jsp\">LogOut</a></li>\n");
      out.write("<li>About</li>\n");
      out.write("<li>Contect</li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write(" \n");
      out.write("<div id=\"mydata\">\n");
      out.write("<center>\n");
      out.write("<form action=\"insert.jsp\" method=\"post\">\n");
      out.write("<table cellpadding=\"20\">\n");
      out.write("<tr>\n");
      out.write("<td>Enter Roll No.</td>\n");
      out.write("<td><input type=\"text\" class=\"A\" placeholder=\"Enter Roll Number\" name=\"n1\"></td>\n");
      out.write("</tr><tr>\n");
      out.write("<td>Enter Name </td>\n");
      out.write("<td><input type=\"text\" class=\"A\" placeholder=\"Enter Name\" name=\"n2\"></td>\n");
      out.write("</tr><tr>\n");
      out.write("<td>Enter Physics Marks</td>\n");
      out.write("<td><input type=\"text\" class=\"A\" placeholder=\"Enter Physics Marks\" name=\"n3\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr> \n");
      out.write("<td>Enter Chemistrty Marks</td>\n");
      out.write("<td><input type=\"text\" class=\"A\" placeholder=\"Enter Chemistrty Marks\" name=\"n4\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Enter  Maths Marks</td>\n");
      out.write("<td><input type=\"text\" placeholder=\"Enter Maths Marks\" class=\"A\" name=\"n5\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"><input type=\"submit\" class=\"B\" value=\"INSERT\"></th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
