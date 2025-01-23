package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginhtml_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/homecommon.jsp");
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
      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"html68.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div  id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li>HOME</li>\n");
      out.write("<li><a href=\"loginhtml.jsp\">LOGIN</a></li>\n");
      out.write("<li><a href=\"regishtml.jsp\">REGISTER</a></li>\n");
      out.write("<li>ABOUT</li>\n");
      out.write("<li>CONTECT</li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write(" \n");
      out.write("<div id=\"mydata\">\n");
      out.write("<center>\n");
      out.write("<form action=\"login.jsp\" method=\"post\">\n");
      out.write("    ");

    String s2=request.getParameter("s1");
    if(s2!=null)
    {
    
      out.write("\n");
      out.write("    ");
      out.print(s2);
      out.write("\n");
      out.write("    ");
}
      out.write("\n");
      out.write("<table cellpadding=\"20\">\n");
      out.write("<tr>\n");
      out.write("<td>Enter Name</td>\n");
      out.write("<td><input type=\"text\" class=\"A\" placeholder=\"Enter name\" name=\"u1\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr> \n");
      out.write("<td>Enter Password</td>\n");
      out.write("<td><input type=\"password\" class=\"A\" placeholder=\"Enter Password\" name=\"u2\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"><input type=\"submit\" class=\"B\" value=\"login\"></th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("    </center>\n");
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
